package ACT_ENTRGABLE_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor de a: ");
		int a = sc.nextInt();
		
		System.out.println("Introduce el valor de b: ");
		int b = sc.nextInt();
		
		Intercambio cam = new Intercambio(a, b);
        cam.intercambiar();

	}

}
