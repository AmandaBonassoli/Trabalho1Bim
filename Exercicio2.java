import java.util.Scanner;

public class Exercicio2 {
	
    @SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		 
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		 
		if (valor > 0) {
			System.out.println("O valor que voc� digitou � positivo = " + valor);
		} else if (valor < 0) {
			System.out.println("O valor que voc� digitou � negativo = " + valor);
		} else
			System.out.println("O valor n�o � positivo, nem negativo, porque � " + valor);
		
		System.out.println("Fim do Exerc�cio");
		 
	}
}
