import java.util.Scanner;

public class Exercicio25 {
	
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
		
		if (media > 10) {
			System.out.println("A nota máxima que o Aluno pode atingir é 10, digite novamente!!");
		} else if (media == 10) {
			System.out.println("O Aluno está Aprovado com Distinção, a média que ele atingiu é " + media);
		} else if (media >= 7) {
			System.out.println("O Aluno está Aprovado, a média que ele atingiu é " + media);
		} else
			System.out.println("O Aluno está Reprovado, a média que ele atingiu é " + media);
		
		System.out.println("Fim do Exercício");
		
   }
}