import java.util.Scanner;

public class Exercicio22 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero menor que 1000: ");
		int numero = teclado.nextInt();
		int unidade;
		int dezena;
		int centena;
		
		unidade = numero / 1;
		dezena = numero / 10;
		centena = numero / 100;
				
		if (numero >= 1 && numero < 1000) {
			System.out.println("O n�mero que voc� digitou cont�m "+unidade+" unidades,"+dezena+" dezenas e "+centena+" centenas.");
		} else
			System.out.println("O n�mero � maior ou igual a 1000, digite novamente!!");
	}
}
