package Act_clase_5;

public class EvaluacionTest {
	
	private int correctas;
	private int incorrectas;
	private int blancas;
	
	public EvaluacionTest(int correctas, int incorrectas, int blancas) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blancas = blancas; 
	}
	
	public void getcorrectas() {
		System.out.println(this.correctas);
	}
	
	public void getincorrectas() {
		System.out.println(this.incorrectas);
	}
	
	public void getblancas() {
		System.out.println(this.blancas);
	}
	
	public void setcorrectas() {
		this.correctas = correctas;
	}
	
	public void setincorrectas() {
		this.incorrectas = incorrectas;
	}
	
	public void setblancas() {
		this.blancas = blancas;
	}
	
	public void calcularNotaFinal() {
		int resultado = correctas * 5 - incorrectas;
		int notafinal = (correctas + incorrectas + blancas) * 5;
		System.out.println("La nota final es de " + resultado + "/" + notafinal);
	}
	
}
