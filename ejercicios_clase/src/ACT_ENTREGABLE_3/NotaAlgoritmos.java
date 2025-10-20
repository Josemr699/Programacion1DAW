package ACT_ENTREGABLE_3;

public class NotaAlgoritmos {
	
	private double parcial1;
	private double parcial2;
	private double parcial3;
	private double examenFinal;
	private double trabajoFinal;
	
	public NotaAlgoritmos(double parcial1, double parcial2, double parcial3, double examenFinal, double trabajoFinal) {
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.parcial3 = parcial3;
		this.examenFinal = examenFinal;
		this.trabajoFinal = trabajoFinal;
		
	}
	
	public void getParcial1() {
		System.out.println(this.parcial1);
	}
	
	public void getParcial2() {
		System.out.println(this.parcial2);
	}
	
	public void getParcial3() {
		System.out.println(this.parcial3);
	}
	
	public void getExamenFinal() {
		System.out.println(this.examenFinal);
	}
	
	public void getTrabajoFinal() {
		System.out.println(this.trabajoFinal);
	}
	
	public void setParcial1() {
		this.parcial1 = parcial1;
	}
	
	public void setParcial2() {
		this.parcial2 = parcial2;
	}
	
	public void setParcial3() {
		this.parcial3 = parcial3;
	}
	
	public void setExamenFinal() {
		this.examenFinal = examenFinal;
	}
	
	public void setTrabajoFinal() {
		this.trabajoFinal = trabajoFinal;
	}
	
	public void calcularNotaFinal() {
		double notaParciales = (parcial1 + parcial2 + parcial3)/3;
		double notaFinal = notaParciales * 0.55 + examenFinal * 0.30 + trabajoFinal * 0.15;
		System.out.printf("La nota final es: %.2f\n", notaFinal);
	}
	
}