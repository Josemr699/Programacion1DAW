package Act_clase_5;

public class NotasExamenes {
	private double nota1;
	private double mediaDeseada;
	
	public NotasExamenes(double nota1, double mediaDeseada) {
		this.nota1 = nota1;
		this.mediaDeseada = mediaDeseada;
	}
	
	public void getNota1() {
		System.out.println(this.nota1);
	}
	
	public void setNota1() {
		this.nota1 = nota1;
	}
	
	public void getMediaDeseada() {
		System.out.println(this.mediaDeseada);
	}
	
	public void setMediaDeseada() {
		this.mediaDeseada = mediaDeseada;
	}
	
	public void calcularNotaNecesaria() {
		double nota2 = (mediaDeseada - (nota1 * 0.4)/0.6);
		System.out.println("La nota que necesitas como mínimo es un: " + nota2);
	}
	

}
