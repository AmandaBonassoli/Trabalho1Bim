import java.util.Scanner;

public class Exercicio6 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numero3 = teclado.nextInt();
		
		if (numero1 >= numero2 && numero2 >= numero3) {
			System.out.println("" + numero1);
			System.out.println("" + numero2);
			System.out.println("" + numero3);
		} else if (numero1 >= numero3 && numero3 >= numero2) {
			System.out.println("" + numero1);
			System.out.println("" + numero3);
			System.out.println("" + numero2);
		} else if (numero2 >= numero1 && numero1 >= numero3) {
			System.out.println("" + numero2);
			System.out.println("" + numero1);
			System.out.println("" + numero3);
		} else if (numero2 >= numero3 && numero3 >= numero1) {
			System.out.println("" + numero2);
			System.out.println("" + numero3);
			System.out.println("" + numero1);
		} else if (numero3 >= numero1 && numero1 >= numero2) {
			System.out.println("" + numero3);
			System.out.println("" + numero1);
			System.out.println("" + numero2);
		} else if (numero3 >= numero2 && numero2 >= numero1) {
			System.out.println("" + numero3);
			System.out.println("" + numero2);
			System.out.println("" + numero1);
		}
		
		System.out.println("Fim do Exercício");
				
   }			
}
 