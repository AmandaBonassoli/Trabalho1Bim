import java.util.Scanner;

public class Exercicio24 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a média de idade dos Alunos: ");
		int idade = teclado.nextInt();
		
		if (idade < 25) {
			System.out.println("Sua turma é Jovem!! A média de idade entre os Alunos é " + idade);
		} else if (idade >= 25 && idade <= 40) {
			System.out.println("Sua turma é Adulta!! A média de idade entre os Alunos é " + idade);
		} else if (idade > 40) {
			System.out.println("Sua turma é Idosa!! A média de idade entre os Alunos é " + idade);
		} else 
			System.out.println("A média digitada está incorreta, digite novamente!!");
		
		System.out.println("Fim do Exercício");
		
	}

}
