package Act_clase_19;

public class Monedero {
	
	private int dosEuros;
	private int unEuro;
	private int cent50;
	private int cent20;
	private int cent10;
	
	public Monedero(int dosEuros, int unEuro, int cent50, int cent20, int cent10) {
		this.dosEuros = dosEuros;
		this.unEuro = unEuro;
		this.cent50 = cent50;
		this.cent20 = cent20;
		this.cent10 = cent10;
	}
	
	public void getDosEuros() {
		System.out.println(this.dosEuros);
	}
	
	public void getUnEuro() {
		System.out.println(this.unEuro);
	}
	
	public void getCent50() {
		System.out.println(this.cent50);
	}
	
	public void getCent20() {
		System.out.println(this.cent20);
	}
	
	public void getCent10() {
		System.out.println(this.cent10);
	}
	
	public void setDosEuros(int dosEuros) {
		this.dosEuros = dosEuros;
	}
	
	public void setUnEuro(int unEuro) {
		this.unEuro = unEuro;
	}
	
	public void setCent50(int cent50) {
		this.cent50 = cent50;
	}
	
	public void setCent20(int cent20) {
		this.cent20 = cent20;
	}
	
	public void setCet10(int cent10) {
		this.cent10 = cent10;
	}
	
	public void calcularTotalEuros() {
		int sumaCent = (dosEuros*200)+(unEuro*100)+(cent50*50)+(cent20*20)+(cent10*10);
		int eurosTotales = sumaCent /100;
		int centTotales = sumaCent %100;
		System.out.println("Tienes "+ eurosTotales+ "€ y "+ centTotales+ " cent");
		
	}

}
