import java.util.Scanner;

public class Exercicio10 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Inicio do Exercicio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto: ");
		float preco1 = teclado.nextFloat();
		System.out.println("Informe o preço do segundo produto: ");
		float preco2 = teclado.nextFloat();
		System.out.println("Informe o preço do terceiro produto: ");
		float preco3 = teclado.nextFloat();
		
		if (preco1 >= preco2 && preco2 >= preco3) {
			System.out.println("O menor preço é: " + preco3);
		} else if (preco1 >= preco3 && preco3 >= preco2) {
			System.out.println("O menor preço é: " + preco2);
		} else if (preco2 >= preco1 && preco1 >= preco3) {
			System.out.println("O menor preço é: " + preco3);
		} else if (preco2 >= preco3 && preco3 >= preco1) {
			System.out.println("O menor preço é: " + preco1);
		} else if (preco3 >= preco1 && preco1 >= preco2) {
			System.out.println("O menor preço é: " + preco2);
		} else if (preco3 >= preco2 && preco2 >= preco1) {
			System.out.println("O menor preço é: " + preco1);
		}
		
		System.out.println("Fim do Exercicio");
		
	}
}