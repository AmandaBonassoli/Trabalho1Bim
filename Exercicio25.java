import java.util.Scanner;

public class Exercicio25 {
	
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
		
		if (media > 10) {
			System.out.println("A nota m�xima que o Aluno pode atingir � 10, digite novamente!!");
		} else if (media == 10) {
			System.out.println("O Aluno est� Aprovado com Distin��o, a m�dia que ele atingiu � " + media);
		} else if (media >= 7) {
			System.out.println("O Aluno est� Aprovado, a m�dia que ele atingiu � " + media);
		} else
			System.out.println("O Aluno est� Reprovado, a m�dia que ele atingiu � " + media);
		
		System.out.println("Fim do Exerc�cio");
		
   }
}