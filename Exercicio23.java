import java.util.Scanner;

public class Exercicio23 {


	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do saque: ");
		int valor = teclado.nextInt();
		int cem;
		int cinquenta;
		int dez;
		int cinco;
		int um;
		cem = valor / 100;
		cinquenta = valor / 50;
		dez = valor / 10;
		cinco = valor / 5;
		um = valor / 1;
		
		if (valor < 10 && valor > 600) {
			System.out.println("Não é possível fornecer valores menores que 10 reais e maiores que 600, digite novamente!!");
		} else if (valor > 10 && valor <= 600) {
			System.out.println("O valor que você digitou contém "+cem+" notas de 100, "+cinquenta+" notas de 50, "+dez+" notas de 10, "+cinco+" notas de 5, "+um+" notas de 1");
		
		System.out.println("Fim do Exercício");
		}
	}
}
