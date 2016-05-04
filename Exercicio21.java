import java.util.Scanner;

public class Exercicio21 {
	
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o mês: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		int ano = teclado.nextInt();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 
				|| mes == 12 && dia >= 1 && dia <=31) {
			System.out.println("É válida!!");
			System.out.println("O dia é " + dia);
			System.out.println("O mês é " + mes);
			System.out.println("O ano é " + ano);
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >=1 && dia <=30) {
			System.out.println("É válida!!");
			System.out.println("O dia é " + dia);
			System.out.println("O mês é " + mes);
			System.out.println("O ano é " + ano);
		} else if (mes == 2 && dia >=1 && dia <=28) {
			System.out.println("É válida!!");
			System.out.println("O dia é " + dia);
			System.out.println("O mês é " + mes);
			System.out.println("O ano é " + ano);
		} else if (mes == 2 && dia == 29) {
			System.out.println("É válida!!");
			System.out.println("O dia é " + dia);
			System.out.println("O mês é " + mes);
			System.out.println("O ano é bissexto = " + ano);
		}
	}
}
