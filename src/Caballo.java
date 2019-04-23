
public class Caballo extends Mamiferos {
	private String color;

	public Caballo() {
		// TODO Auto-generated constructor stub
		super(1, 0);
		this.setColor("Negro");
	}

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

	public Caballo(int peso, int edad, String color, String nombre) {
		// TODO Auto-generated constructor stub
		super(peso, edad, nombre);
		this.setColor(color);
	}

	public void comer() {
		System.out.println("soy un caballo como paja");

	}

	public void brincar() {
		System.out.println("soy un caballo puedo brincar obstáculos");

	}

	public void getColor() {
		 System.out.println(color);

	}

	public void setColor(String color) {
		this.color = color;
	}

}
