import java.util.Scanner;

public class Exercicio16b {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número que você digitou é par ---> " + numero);
		} else
			System.out.println("O número que você digitou é ímpar ---> " + numero);
		
		System.out.println("Fim do Exercício");

   }
}
