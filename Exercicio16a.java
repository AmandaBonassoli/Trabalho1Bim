import java.util.Scanner;

public class Exercicio16a {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do Aluno: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota do Aluno: ");
		float nota2 = teclado.nextFloat();
		float soma = nota1 + nota2;
		float media = soma / 2;
		
		if(media <= 3) {
			System.out.println("O Aluno está Reprovado, sua média é " + media);
		} else if (media <= 6.9) {
			System.out.println("O Aluno está de Exame, sua média é " + media);
		} else if (media <= 10) {
			System.out.println("O Aluno está Aprovado, sua média é " + media);
		} else
			System.out.println("Nota Inválida, digite novamente!!");
		
		System.out.println("Fim do Exercício");
		
   }
}