package Act_clase_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce importe de la compra: ");
		double total = sc.nextDouble();
		
		Compra cp = new Compra(total);
		cp.mostrarTotalConDescuento();

	}

}
