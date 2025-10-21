package Act_clase_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la nota del primer examen: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Dime la nota que deseas sacar: ");
		double mediaDeseada = sc.nextDouble();
		
		NotasExamenes nm = new NotasExamenes(nota1, mediaDeseada);
		nm.calcularNotaNecesaria();
		
	}

}
