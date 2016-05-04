import java.util.Scanner;

public class Exercicio19 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
	    System.out.println("Digite o valor de a: ");
	    float a = teclado.nextFloat();
	    
	    if (a == 0) {
	    	System.out.println("O valor de a � igual a zero, n�o � uma equa��o do 2�grau!!");
	    } else 
	    System.out.println("Digite o valor de b: ");
	    float b = teclado.nextFloat();
	    System.out.println("Digite o valor de c: ");
	    float c = teclado.nextFloat();
	    float delta;
	    float raiz;
	    float raiz1;
	    float raiz2;
	    
	    delta =  (b * b) - 4 * a * c;
	    if (delta < 0) {         
	    	System.out.println("A equa��o n�o possui raizes reais!!");
	    } else if (delta == 0) {       
	        raiz = (float) (-b + Math.sqrt(delta)) / 2 * a;        
	    			System.out.println("Raiz da Equa��o = " + raiz);     
        } else if (delta > 0) {
        	System.out.println("A equa��o possui duas raiz reais: ");
	        raiz1 = (float) (-b + Math.sqrt(delta)) / 2 * a;
	        System.out.println("Raiz1 da equa��o = " + raiz1);
	        raiz2 = (float) (-b - Math.sqrt(delta)) / 2*a;
	        System.out.println("Raiz2 da equa��o = " + raiz2);
        }
    }
}
