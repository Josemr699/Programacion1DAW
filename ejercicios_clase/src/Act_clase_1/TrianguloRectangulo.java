package Act_clase_1;

public class TrianguloRectangulo {
	
	private double catetoA;
	private double catetoB;
	
	public TrianguloRectangulo(double catetoA, double catetoB) {
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}
	
	public void getcatetoA() {
		System.out.println(this.catetoA);
	}
	
	public void setcatetoA(double catetoA) {
		this.catetoA = catetoA;
	}
	
	public void getcactetoB() {
		System.out.println(this.catetoB);
	}
	
	public void setcactetoB(double cactetoB) {
		this.catetoB = cactetoB;
	}
	
	public void calcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(catetoA,  2) + Math.pow(catetoB,  2));
		System.out.printf("La hipotenusa es %.2f \n", hipotenusa );
		
	}
}
