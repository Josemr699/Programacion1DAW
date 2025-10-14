package Act_clase_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime catetoA: ");
		double catetoA = sc.nextDouble();
		
		System.out.println("Dime catetoB: ");
		double catetoB = sc.nextDouble();
		
		TrianguloRectangulo triangulo = new TrianguloRectangulo(catetoA, catetoB);
		triangulo.calcularHipotenusa();

	}

}
