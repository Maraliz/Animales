
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caballo pepe = new Caballo(20 , 3,"marron","Pepe");
		Pegaso luis = new Pegaso(300, 10, "azul");
		
		Humano  Mara= new Humano();
		Humano juan  = new Humano();
		
		
		Hada campanita = new Hada();
		Pegaso jesus = new Pegaso("verde");
		Hada peter = new Hada();
		Vampiro rafael = new Vampiro();
		Murcielago  toto = new Murcielago();
		
		
//		Hada[] zoo = {pepe,luis, jesus, campanita}; 
		Volador[] zoo = {jesus,peter, campanita,rafael,toto}; 
		
		Mamiferos arrayDeMamiferos []  =   {jesus,peter, campanita,rafael,toto,pepe,luis,Mara,juan }; 
//		System.out.println(pepe.getPeso());
//		pepe.comer();
//		pepe.brincar();
//		luis.comer();
//		Mara.comer();
		
//		for ( int i = 0 ; i<=2 ;  i++)
//		{
//			
//			zoo[i].comer();
//		}
//		
		
		for (Volador creatura : zoo) 
		{ 
			
//			System.out.println("Hola mi nombre es "+ creatura.getName());

//			System.out.println("Y soy color : ");
//			creatura.getColor();
//			
//			System.out.println("mi peso es:"+ creatura.getPeso() + " Kilos");
//			System.out.println("y tengo: "+ creatura.getEdad() + " años");
			creatura.volar();
			System.out.println("\n");
			
		}
		
		for (Mamiferos chingadera : arrayDeMamiferos) 
		{ 
			
			System.out.println("Hola mi nombre es "+ chingadera.getName());

			System.out.println("Y soy color : ");
			chingadera.getColor();
//			
			System.out.println("mi peso es:"+ chingadera.getPeso() + " Kilos");
			System.out.println("y tengo: "+ chingadera.getEdad() + " años");
//			creatura.volar();
			System.out.println("\n");
			
		}
		
		
		
		
	}

}
