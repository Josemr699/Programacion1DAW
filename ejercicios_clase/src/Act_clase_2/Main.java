package Act_clase_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el número de preguntas corectas: ");
		int correctas = sc.nextInt();
		
		System.out.println("Dime el número de preguntas incorrectas: ");
		int incorrectas = sc.nextInt();
		
		System.out.println("Dime el número de preguntas en blanco: ");
		int blancas = sc.nextInt();
		
		EvaluacionTest test = new EvaluacionTest(correctas, incorrectas, blancas);
		test.calcularNotaFinal();
	}

}
