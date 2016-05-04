import java.util.Scanner;

public class Exercicio18 {
	
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		int lado1 = teclado.nextInt();
		System.out.println("Digite o segundo lado: ");
		int lado2 = teclado.nextInt();
		System.out.println("Digite o terceiro lado: ");
		int lado3 = teclado.nextInt();
		
		if (lado1 + lado2 < lado3) {
			System.out.println("Não é um triângulo, digite novamente!!");
		} else if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("É um Triângulo Equilátero!!");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("É um Triângulo Isósceles!!");
		} else if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("É um Triângulo Escaleno!!");
		}
	}
}
