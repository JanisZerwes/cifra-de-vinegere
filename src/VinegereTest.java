import java.util.Scanner;

public class VinegereTest {

	public static void main(String[] args) {
		// ainda n�o fechou a l�gica aqui
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = sc.nextLine();
		System.out.println("Digite a chave");
		String chave = sc.nextLine();
		CifraDeVinegere cv = new CifraDeVinegere(frase, chave);

		System.out.println(" encrypted");
		cv.cifrar();
		System.out.println("decifrado");
		cv.decifrar();
	}

}
