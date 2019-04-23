
public class Pegaso extends Caballo {

	
	public Pegaso() {
		// TODO Auto-generated constructor stub
		super(1,0);
	}
	public void volar() {
		System.out.println("uso alas para volar");
		
	}
	public Pegaso(String color) {
		// TODO Auto-generated constructor stub
		super(1,0,color);
	}
	public Pegaso (int peso, int edad, String color) {
		super (peso,edad, color);
	}
}
