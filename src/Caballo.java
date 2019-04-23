
public class Caballo extends Mamiferos {
	private String color;
	

	public Caballo(int peso, int edad) {
		// TODO Auto-generated constructor stub
		super(peso, edad);
		this.setColor("Negro");
	}

	public Caballo(int peso, int edad, String color) {
		// TODO Auto-generated constructor stub
		super(peso, edad);
		this.setColor(color);
	}

	public void comer() {
		System.out.println("soy un caballo como paja");

	}

	public void brincar() {
		System.out.println("soy un caballo puedo brincar obstáculos");

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
