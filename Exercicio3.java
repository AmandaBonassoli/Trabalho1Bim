import java.util.Scanner;

public class Exercicio3 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu sexo - F/f(Feminino) ou M/m(Masculino): ");
		String sexo = teclado.next();
		
		if ("F".equalsIgnoreCase(sexo)) {
			System.out.println("Seu sexo � Feminino = " + sexo);
		} else if ("M".equalsIgnoreCase(sexo)) {
		    System.out.println("Seu sexo � Masculino = " + sexo);
		} else
			System.out.println("Sexo Inv�lido, digite novamente!!");
		
		System.out.println("Fim do Exerc�cio");
			
   }
}