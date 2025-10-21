package Act_clase_8;

public class DistanciaAbsoluta {
	
	private double numero1;
	private double numero2;
	
	public DistanciaAbsoluta(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public void getNumero1() {
		System.out.println(this.numero1);
	}
	
	public void setNumero1() {
		this.numero1 = numero1;
	}
	
	public void getNumero2() {
		System.out.println(this.numero2);
	}
	
	public void setNumero2() {
		this.numero2 = numero2;
	}
	
	public void mostrarDistancia() {
		double resultado = Math.abs(numero1 - numero2);
		System.out.println("El valor absoluto es: " + resultado);
	}

}
