import java.util.Scanner;

public class Exercicio17 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do Aluno: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota do Aluno: ");
		float nota2 = teclado.nextFloat();
		float soma = nota1 + nota2;
		float media = soma / 2;
		
		if (media <= 4) {
			System.out.println("A primeira nota � " + nota1);
			System.out.println("A segunda nota � " + nota2);
			System.out.println("Sua m�dia � " + media);
			System.out.println("O Aluno tirou 'E', ou seja, est� Reprovado!!");
		} else if (media <= 6) {
			System.out.println("A primeira nota � " + nota1);
			System.out.println("A segunda nota � " + nota2);
			System.out.println("Sua m�dia � " + media);
			System.out.println("O Aluno tirou 'D', ou seja, est� Reprovado!!");
		} else if (media <= 7.5) {
			System.out.println("A primeira nota � " + nota1);
			System.out.println("A segunda nota � " + nota2);
			System.out.println("Sua m�dia � " + media);
			System.out.println("O Aluno tirou 'C', ou seja est� Aprovado!!");
		} else if (media <= 9) {
			System.out.println("A primeira nota � " + nota1);
			System.out.println("A segunda nota � " + nota2);
			System.out.println("Sua m�dia � " + media);
			System.out.println("O Aluno tirou 'B', ou seja est� Aprovado!!");
		} else if (media <= 10) {
			System.out.println("A primeira nota � " + nota1);
			System.out.println("A segunda nota � " + nota2);
			System.out.println("Sua m�dia � " + media);
			System.out.println("O Aluno tirou 'A', ou seja est� Aprovado!!");
		} else
			System.out.println("Nota Inv�lida, digite novamente");
		
		System.out.println("Fim do Exerc�cio");
		
	}
}
