
public class Mamiferos {
	private int peso;
	private int edad;
	private String comer;
	private String name ;

	public Mamiferos(int peso, int edad) {
		this.peso = peso;
		this.edad = edad;
		this.name="anonimo";

	}
	public Mamiferos(int peso, int edad,String name) {
		this.peso = peso;
		this.edad = edad;
		this.setName(name) ; 

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
		System.out.println("brinco genericamente, soy un Mamifero Equis");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getColor () {
		System.out.println(" no tengo color , soy un mamiferos generico");
	}


	
}
