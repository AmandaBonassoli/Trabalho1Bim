import java.util.Scanner;

public class Exercicio20 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
	    System.out.println("Início do Exercício");
	 
	    Scanner teclado = new Scanner(System.in);
	   
	    System.out.println("Digite um ano: ");
	    int ano = teclado.nextInt();
	    
	    if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
		    System.out.println("O ano é bissexto");
	    } else if (ano % 4 >= 0) {
		    System.out.println("O ano não é bissexto");
	    }
	   
	    System.out.println("Fim do Exercício");
		   
   } 	   
}

