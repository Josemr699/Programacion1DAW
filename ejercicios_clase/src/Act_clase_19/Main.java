package Act_clase_19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántas monedas de dos euros tienes:");
		int dosEuros = sc.nextInt();
		
		System.out.println("Cuántas monedas de un euro tienes:");
		int unEuro = sc.nextInt();
		
		System.out.println("Cuántas monedas de 50 céntimos tienes:");
		int cent50 = sc.nextInt();
		
		System.out.println("Cuántas monedas de 20 céntimos tienes:");
		int cent20 = sc.nextInt();
		
		System.out.println("Cuántas monedas de 10 céntimos tienes:");
		int cent10 = sc.nextInt();
		
		Monedero mon = new Monedero(dosEuros, unEuro, cent50, cent20, cent10);
		mon.calcularTotalEuros();

	}

}
