
public class Pegaso extends Caballo implements Volador {

	
	public Pegaso() {
		// TODO Auto-generated constructor stub
		super(1,0);
	}
	public void volar() {
		System.out.println("uso alas para volar, soy un pegaso");
		
	}
	public Pegaso(String color) {
		// TODO Auto-generated constructor stub
		super(1,0,color);
	}
	public Pegaso (int peso, int edad, String color) {
		super (peso,edad, color);
	}
	
	public void comer() {
		System.out.println("soy un pegaso  y como volando");

	}
	
	public void brincar() {
		System.out.println("Y yo para que brinco , soy un pegaso");

	}

}
