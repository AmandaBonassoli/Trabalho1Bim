import java.util.Scanner;

public class Exercicio16b {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero que voc� digitou � par ---> " + numero);
		} else
			System.out.println("O n�mero que voc� digitou � �mpar ---> " + numero);
		
		System.out.println("Fim do Exerc�cio");

   }
}
