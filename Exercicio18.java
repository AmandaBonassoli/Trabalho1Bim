import java.util.Scanner;

public class Exercicio18 {
	
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		int lado1 = teclado.nextInt();
		System.out.println("Digite o segundo lado: ");
		int lado2 = teclado.nextInt();
		System.out.println("Digite o terceiro lado: ");
		int lado3 = teclado.nextInt();
		
		if (lado1 + lado2 < lado3) {
			System.out.println("N�o � um tri�ngulo, digite novamente!!");
		} else if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("� um Tri�ngulo Equil�tero!!");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("� um Tri�ngulo Is�sceles!!");
		} else if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("� um Tri�ngulo Escaleno!!");
		}
	}
}
