package Act_clase_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer número: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduce segundo número: ");
		double numero2 = sc.nextDouble();
		
		DistanciaAbsoluta dist = new DistanciaAbsoluta(numero1, numero2);
		dist.mostrarDistancia();

	}

}
