
public class Mamiferos {
	private int peso;
	private int edad;
	private String comer;

	public Mamiferos(int peso, int edad) {
		this.peso = peso;
		this.edad = edad;

	}

	public int getPeso() {
		return peso;

	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void comer() {
		System.out.println("comiendo ...");
	}

	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	
}
