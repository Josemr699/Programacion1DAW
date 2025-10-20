package ACT_ENTREGABLE_1;

public class NumeroInvertido {
	
	private int numero;
	
	public NumeroInvertido(int numero) {
		this.numero = numero;
   }
	
	public void getnumero() {
		System.out.println(this.numero);
	}
	
	public void setnumero() {
		this.numero = numero; 
	}
	
	public void invertirNumero() {
		int primeraCifra = numero / 10;
		int segundaCifra = numero % 10;
        int resultado = segundaCifra * 10 + primeraCifra;
        
        System.out.println("Número invertido: " + resultado);
	}
}
