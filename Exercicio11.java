import java.util.Scanner;

public class Exercicio11 {
	
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		System.out.println("Início do Exercício");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda M(Matutino), V(Vespertino) ou N(Noturno): ");
		String turno = teclado.next();
		
		if("M".equalsIgnoreCase(turno)) {
			System.out.println("Bom Dia!! Você estuda no turno Matutino --> " + turno);
		} else if ("V".equalsIgnoreCase(turno)) {
			System.out.println("Boa Tarde!! Você estuda no turno Vespertino --> " + turno);
		} else if ("N".equalsIgnoreCase(turno)) {
			System.out.println("Boa Noite!! Você estuda no turno Noturno --> " + turno);
		} else
			System.out.println("Turno Inválido, digite novamente!!");
		
		System.out.println("Fim do Exercício");
	
	}
}
