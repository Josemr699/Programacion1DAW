package Act_clase_3;

public class Compra {
	
	private double total;
	
	public Compra(double total) {
		this.total = total;
		
	}
	
	public void getTotal() {
		System.out.println(this.total);
	
	}
	
	public void setTotal() {
		this.total = total;
		
	}
	
	public void mostrarTotalConDescuento() {
		double descuento = this.total * 0.15;
		System.out.println("Total con descuento: " + (this.total - descuento));
	}

}
