import java.util.Scanner;

public class Exercicio15 {
	
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do produto: ");
		float preco = teclado.nextFloat();
		System.out.println("Digite o c�digo de origem do produto 1(S), 2(N), 3(L), 4(O), 5/6(NE) 7/8(CO): ");
		int codigo = teclado.nextInt();
		
		if (codigo == 1) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Sul ---> " + codigo);
		} else if (codigo == 2) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Norte ---> " + codigo);
		} else if (codigo == 3) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Leste ---> " + codigo);
		} else if (codigo == 4) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Oeste ---> " + codigo);
		} else if (codigo == 5 || codigo == 6) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Nordeste ---> " + codigo);
		} else if (codigo == 7 || codigo == 8) {
			System.out.println("Pre�o: " + preco);
			System.out.println("Proced�ncia Centro-Oeste ---> " + codigo);
		} else if (codigo >=9) {
		    System.out.println("Pre�o: " + preco);
		    System.out.println("Produto Importado!!");
		} else
			System.out.println("Produto Inexistente!!");
		    
		System.out.println("Fim do Exerc�cio");
	}
}
