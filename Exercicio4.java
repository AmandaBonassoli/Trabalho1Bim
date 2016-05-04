import java.util.Scanner;

public class Exercicio4 {

	@SuppressWarnings("resource")
	public static void main (String [] args) {
	    System.out.println("Início do Exercício");
	 
	    Scanner teclado = new Scanner(System.in);
	   
	    System.out.println("Digite um ano que tenha 4 dígitos: ");
	    int ano = teclado.nextInt();
	    
	    if (ano < 1000) {
        	System.out.println("O ano tem menos que 4 dígitos, digite novamente!!");
        } else if (ano > 9999) {
        	System.out.println("O ano tem mais que 4 dígitos, digite novamente!!");
        } else if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
		    System.out.println("O ano é bissexto = " + ano);
	    } else 
		    System.out.println("O ano não é bissexto = " + ano);
	   
	    System.out.println("Fim do Exercício");
		   
   } 	   
}
