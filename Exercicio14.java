import java.util.Scanner;

public class Exercicio14 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para informar o dia da semana: 1(Dom), 2(Seg), 3(Ter), 4(Qua), 5(Qui), 6(Sex), 7(S�b): ");
		char numero = teclado.nextLine().charAt(0);

		if (numero == '1') {
			System.out.println("O Dia da Semana � Domingo, digitou " + numero);
		} else if (numero == '2') {
			System.out.println("O Dia da Semana � Segunda, digitou " + numero);
		} else if (numero == '3') {
			System.out.println("O Dia da Semana � Ter�a, digitou " + numero);
		} else if (numero == '4') {
			System.out.println("O Dia da Semana � Quarta, digitou " + numero);
		} else if (numero == '5') {
			System.out.println("O Dia da Semana � Quinta, digitou " + numero);
		} else if (numero == '6') {
			System.out.println("O Dia da Semana � Sexta, digitou " + numero);
		} else if (numero == '7') {
			System.out.println("O Dia da Semana � S�bado, digitou " + numero);
		} else 
			System.out.println("O valor � Inv�lido, digite novamente!!");
		
		System.out.println("Fim do Exerc�cio");
	}
}
