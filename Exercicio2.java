import java.util.Scanner;

public class Exercicio2 {
	
    @SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		 
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		 
		if (valor > 0) {
			System.out.println("O valor que você digitou é positivo = " + valor);
		} else if (valor < 0) {
			System.out.println("O valor que você digitou é negativo = " + valor);
		} else
			System.out.println("O valor não é positivo, nem negativo, porque é " + valor);
		
		System.out.println("Fim do Exercício");
		 
	}
}
