import java.util.Scanner;

public class Exercicio3 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu sexo - F/f(Feminino) ou M/m(Masculino): ");
		String sexo = teclado.next();
		
		if ("F".equalsIgnoreCase(sexo)) {
			System.out.println("Seu sexo é Feminino = " + sexo);
		} else if ("M".equalsIgnoreCase(sexo)) {
		    System.out.println("Seu sexo é Masculino = " + sexo);
		} else
			System.out.println("Sexo Inválido, digite novamente!!");
		
		System.out.println("Fim do Exercício");
			
   }
}