import java.util.Scanner;

public class Exercicio11 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("In�cio do Exerc�cio");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Em que turno voc� estuda M(Matutino), V(Vespertino) ou N(Noturno): ");
		String turno = teclado.next();
		
		if("M".equalsIgnoreCase(turno)) {
			System.out.println("Bom Dia!! Voc� estuda no turno Matutino --> " + turno);
		} else if ("V".equalsIgnoreCase(turno)) {
			System.out.println("Boa Tarde!! Voc� estuda no turno Vespertino --> " + turno);
		} else if ("N".equalsIgnoreCase(turno)) {
			System.out.println("Boa Noite!! Voc� estuda no turno Noturno --> " + turno);
		} else
			System.out.println("Turno Inv�lido, digite novamente!!");
		
		System.out.println("Fim do Exerc�cio");
	
	}
}
