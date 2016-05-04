import java.util.Scanner;

public class Exercicio14 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número para informar o dia da semana: 1(Dom), 2(Seg), 3(Ter), 4(Qua), 5(Qui), 6(Sex), 7(Sáb): ");
		char numero = teclado.nextLine().charAt(0);

		if (numero == '1') {
			System.out.println("O Dia da Semana é Domingo, digitou " + numero);
		} else if (numero == '2') {
			System.out.println("O Dia da Semana é Segunda, digitou " + numero);
		} else if (numero == '3') {
			System.out.println("O Dia da Semana é Terça, digitou " + numero);
		} else if (numero == '4') {
			System.out.println("O Dia da Semana é Quarta, digitou " + numero);
		} else if (numero == '5') {
			System.out.println("O Dia da Semana é Quinta, digitou " + numero);
		} else if (numero == '6') {
			System.out.println("O Dia da Semana é Sexta, digitou " + numero);
		} else if (numero == '7') {
			System.out.println("O Dia da Semana é Sábado, digitou " + numero);
		} else 
			System.out.println("O valor é Inválido, digite novamente!!");
		
		System.out.println("Fim do Exercício");
	}
}
