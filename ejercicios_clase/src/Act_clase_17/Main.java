package Act_clase_17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A que hora a salido:");
		int horaSalida = sc.nextInt();
		
		System.out.println("A que minuto a salido:");
		int minutoSalida = sc.nextInt();
		
		System.out.println("A que segundo a salido:");
		int segundoSalida = sc.nextInt();
		
		System.out.println("Cuantos segundos a tardado en llegar:");
		int tiempoTotalSegundos = sc.nextInt();
		
		ViajeCiclista v1 = new ViajeCiclista(horaSalida, minutoSalida, segundoSalida, tiempoTotalSegundos);
		v1.mostrarHoraLlegada();

	}

}
