import java.util.Scanner;

public class Exercicio13 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora: ");
		float valor = teclado.nextFloat();
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		float hora = teclado.nextFloat();
		float  sbruto;
		float  inss;
		float  fgts;
		float  sliquido;
		float  sliquido2;
		float  sliquido3;
		float  sliquido4;
		float  ir1;
		float  ir2;
		float  ir3;
		
		
		sbruto = valor * hora;
		
		inss = (sbruto/100) * 10;
		
		fgts = (sbruto/100)*11;
		
		ir1 = (sbruto /100) * 5;
		ir2 = (sbruto/100) * 10;
		ir3 = (sbruto/100)* 20;
		
		sliquido = sbruto - inss;
		sliquido2 = sbruto - ir1 - inss;
		sliquido3 = sbruto - ir2 - inss;
		sliquido4 = sbruto - ir3 - inss;
		
		if (sbruto <= 900) {
			System.out.println("Salário Bruto: " + sbruto);
			System.out.println("INSS: " + inss);
			System.out.println("Fgts: " + fgts);
			System.out.println("Salário Líquido: " + sliquido);
		} else if (sbruto <= 1500) {
	        System.out.println("Salário Bruto: " + sbruto);
	        System.out.println("IR: " + ir1);
	        System.out.println("INSS: " + inss);
			System.out.println("Fgts: " + fgts);
			System.out.println("Salário Líquido: " + sliquido2);
		} else if (sbruto <= 2500) {
			System.out.println("Salário Bruto: " + sbruto);
	        System.out.println("IR: " + ir2);
	        System.out.println("INSS: " + inss);
			System.out.println("Fgts: " + fgts);
			System.out.println("Salário Líquido: " + sliquido3);
		} else if (sbruto > 2500) {
			System.out.println("Salário Bruto: " + sbruto);
		    System.out.println("IR: " + ir3);
		    System.out.println("INSS: " + inss);
		    System.out.println("Fgts: " + fgts);
		    System.out.println("Salário Líquido: " + sliquido4);
		}
		
		System.out.println("Fim do Exercício");

	}
}
