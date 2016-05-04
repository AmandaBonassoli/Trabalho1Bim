import java.util.Scanner;

public class Exercicio1 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = teclado.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior número que você digitou é " + numero1);
		} else if (numero2 > numero1) {
			System.out.println("O maior número que você digitou é " + numero2);
		} else 
			System.out.println("O valor dos dois números são iguais!!");
			
		System.out.println("Fim do Exercício");
		
   }
}