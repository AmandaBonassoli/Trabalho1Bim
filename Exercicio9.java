import java.util.Scanner;

public class Exercicio9 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int numero3 = teclado.nextInt();
		
		if (numero1 >= numero2 && numero2 >= numero3) {
			System.out.println("O maior n�mero � " + numero1);
			System.out.println("O menor n�mero � " + numero3);
		} else if (numero1 >= numero3 && numero3 >= numero2) {
			System.out.println("O maior n�mero � " + numero1);
			System.out.println("O menor n�mero � " + numero2);
		} else if (numero2 >= numero1 && numero1 >= numero3) {
			System.out.println("O maior n�mero � " + numero2);
			System.out.println("O menor n�mero � " + numero3);
		} else if (numero2 >= numero3 && numero3 >= numero1) {
			System.out.println("O maior n�mero � " + numero2);
			System.out.println("O menor n�mero � " + numero1);
		} else if (numero3 >= numero1 && numero1 >= numero2) {
			System.out.println("O maior n�mero � " + numero3);
			System.out.println("O menor n�mero � " + numero2);
		} else if (numero3 >= numero2 && numero2 >= numero1) {
			System.out.println("O maior n�mero � " + numero3);
			System.out.println("O menor n�mero � " + numero1);
		}
			
		System.out.println("Fim do Exerc�cio");
		
   }
}
