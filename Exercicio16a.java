import java.util.Scanner;

public class Exercicio16a {
	
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
		
		if(media <= 3) {
			System.out.println("O Aluno est� Reprovado, sua m�dia � " + media);
		} else if (media <= 6.9) {
			System.out.println("O Aluno est� de Exame, sua m�dia � " + media);
		} else if (media <= 10) {
			System.out.println("O Aluno est� Aprovado, sua m�dia � " + media);
		} else
			System.out.println("Nota Inv�lida, digite novamente!!");
		
		System.out.println("Fim do Exerc�cio");
		
   }
}