package ACT_ENTREGABLE_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la nota de la primera parcial: ");
		double parcial1 = sc.nextDouble();
		
		System.out.println("Introduce la nota de la segunda parcial: ");
		double parcial2 = sc.nextDouble();
		
		System.out.println("Introduce la nota de la tercera parcial: ");
		double parcial3 = sc.nextDouble();
		
		System.out.println("Introduce la nota del examen final: ");
		double examenFinal = sc.nextDouble();
		
		System.out.println("Introduce la nota del trabajo final: ");
		double trabajoFinal = sc.nextDouble();
		
		NotaAlgoritmos notfin = new NotaAlgoritmos(parcial1, parcial2, parcial3, examenFinal, trabajoFinal);
        notfin.calcularNotaFinal();

	}

}
