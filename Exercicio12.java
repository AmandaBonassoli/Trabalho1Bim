import java.util.Scanner;

public class Exercicio12 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro ou decimal: ");
		float numero1 = teclado.nextFloat();
		int numero2 = (int) numero1;
	      
	      if(numero1 - numero2 == 0) {
	    	  System.out.println("O n�mero � um inteiro");
		 } else if (numero1 - numero2 != 0)
			 System.out.println("O n�mero � um decimal");
	      
	     System.out.println("Fim do Exerc�cio");
		 
	}
}
