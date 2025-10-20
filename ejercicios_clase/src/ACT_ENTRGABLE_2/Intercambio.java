package ACT_ENTRGABLE_2;

public class Intercambio {
	
	private int a;
	private int b;
	
	public Intercambio(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void geta() {
		System.out.println(this.a);
	}
	
	public void seta() {
		this.a = a;
	}
	
	public void getb() {
		System.out.println(this.b);
	}
	
	public void setb() {
		this.b = b;
	}
	
	public void intercambiar() {
	    int inter = a;
	    a = b;
	    b = inter;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
}
