package Act_clase_17;

public class ViajeCiclista {
	private int horaSalida;
	private int minutoSalida;
	private int segundoSalida;
	private int tiempoTotalSegundos;
	
	public ViajeCiclista(int horaSalida, int minutoSalida, int segundoSalida, int tiempoTotalSegundos) {
		this.horaSalida = horaSalida;
		this.minutoSalida = minutoSalida;
		this.segundoSalida = segundoSalida;
		this.tiempoTotalSegundos = tiempoTotalSegundos;

	}
	
	public void getHoraSalida() {
		System.out.println(this.horaSalida);
	}
	
	public void getMinutoSalida() {
		System.out.println(this.minutoSalida);
	}
	
	public void getSegundoSalida() {
		System.out.println(this.segundoSalida);
	}
	
	public void getTiempoTotalSegundos() {
		System.out.println(this.tiempoTotalSegundos);
	}
	
	public void setHoraSalida() {
		this.horaSalida = horaSalida;
	}
	
	public void setMinutoSalida() {
		this.minutoSalida = minutoSalida;
	}
	
	public void setSegundoSalida() {
		this.segundoSalida = segundoSalida;
	}
	
	public void setTotalTiempoSegundos() {
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	public void mostrarHoraLlegada() {
		int tiempoLlegadaSegundos = (horaSalida*3600)+(minutoSalida*60)+segundoSalida+tiempoTotalSegundos;
		int horaLlegada = (tiempoLlegadaSegundos/3600) %24;
		int minutoLlegada = (tiempoLlegadaSegundos/3600)%60;
		int segundoLlegada = tiempoLlegadaSegundos %60;
		System.out.println("Ha llegado a las "+horaLlegada+":"+minutoLlegada+":"+segundoLlegada);
		
	}




}
