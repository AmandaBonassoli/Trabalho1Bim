import java.util.Scanner;

public class Exercicio1 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite outro n�mero: ");
		int numero2 = teclado.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior n�mero que voc� digitou � " + numero1);
		} else if (numero2 > numero1) {
			System.out.println("O maior n�mero que voc� digitou � " + numero2);
		} else 
			System.out.println("O valor dos dois n�meros s�o iguais!!");
			
		System.out.println("Fim do Exerc�cio");
		
   }
}