
public class GerarAlfabeto {
	public char[] gerarAlfabeto() {
		char[] abc = new char[96];

		for (int i = 32; i <= 127; i++) {
			abc[i - 32] = (char) i;
		}
		return abc;
	}
}
