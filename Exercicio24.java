import java.util.Scanner;

public class Exercicio24 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a m�dia de idade dos Alunos: ");
		int idade = teclado.nextInt();
		
		if (idade < 25) {
			System.out.println("Sua turma � Jovem!! A m�dia de idade entre os Alunos � " + idade);
		} else if (idade >= 25 && idade <= 40) {
			System.out.println("Sua turma � Adulta!! A m�dia de idade entre os Alunos � " + idade);
		} else if (idade > 40) {
			System.out.println("Sua turma � Idosa!! A m�dia de idade entre os Alunos � " + idade);
		} else 
			System.out.println("A m�dia digitada est� incorreta, digite novamente!!");
		
		System.out.println("Fim do Exerc�cio");
		
	}

}
