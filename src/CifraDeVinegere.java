import java.text.Normalizer;

public class CifraDeVinegere {

	char[] mensagem;
	char[] chave;
	char[] resultado;
	char[] texto;
	char matriz[][];

	public CifraDeVinegere(String msg, String chave) {
		msg = RetirarAcento(msg);
		this.mensagem = msg.toCharArray();
		char[] chaveTemp = chave.toCharArray();
		this.chave = new char[msg.length()];
		int cont = 0;

		for (int i = 0; i < msg.length(); i++) {
			this.chave[i] = chaveTemp[cont];
			cont++;
			if (cont == chaveTemp.length) {
				cont = 0;
			}
		}
		GerarMatriz gm = new GerarMatriz();
		this.matriz = gm.gerarMatriz();
		// cifrar();
	}

	public static String RetirarAcento(String str) {
		str = Normalizer.normalize(str, Normalizer.Form.NFC);
		str = str.replaceAll("[^\\p{ASCII}]", "");
		return str;
	}

	public String cifrar() {
		char[] cifrado = new char[mensagem.length];
		String retorno = "";
		int x, y;

		for (int cont = 0; cont < mensagem.length; cont++) {
			x = (int) this.mensagem[cont] - 32;
			y = (int) this.chave[cont] - 32;
			cifrado[cont] = this.matriz[x][y];
		}
		this.resultado = cifrado;

		System.out.println(cifrado);

		for (int i = 0; i < cifrado.length; i++) {
			retorno += cifrado[i];
		}

		return retorno;
	}

	public String decifrar() {
		char[] decifrado = new char[mensagem.length];
		String retorno = "";
		int x = 0, y = 0;

		for (int cont = 0; cont < mensagem.length; cont++) {
			x = (int) this.mensagem[cont] - 32;
			y = (int) this.chave[cont] - 32;

			char[] coluna = new char[96];

			for (int i = 0; i < 96; i++) {
				coluna[i] = this.matriz[i][y];
			}
			int a = 0;
			boolean teste = false;
			do {
				if (coluna[a] == mensagem[cont]) {
					break;
				}
				a++;
			} while (teste == false);
			decifrado[cont] = this.matriz[a][0];

		}
		for (int i = 0; i < decifrado.length; i++) {
			retorno += decifrado[i];

		}
		System.out.println(this.mensagem);
		System.out.println(this.chave);
		System.out.println(decifrado);

		this.resultado = decifrado;
		return retorno;
	}

}
