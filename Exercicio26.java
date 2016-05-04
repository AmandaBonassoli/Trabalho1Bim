import java.util.Scanner;

public class Exercicio26 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main (String[] args) {
		System.out.println("Inicio do Exercicio");

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Gerar os números ímpares entre 100 e 200: ");

		for (int numero = 100; numero <= 200; numero++) {

			if ((numero % 2) != 0) {
				System.out.println("" + numero);
			}

		}
		
		System.out.println("Fim do Exercicio");
	}
}
