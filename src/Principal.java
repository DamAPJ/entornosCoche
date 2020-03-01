

public class Principal {
//COCHEEE
	public static void main(String[] args) {
		//Coche de Pilar
		Coche cochePilar = new Coche("4427QVk", "Citroen", "Model X", "Blue" );
		
		cochePilar.acelerar();
		cochePilar.acelerar();
		
		System.out.println(cochePilar.estadoCoche());
		
		//Nuevo Coche Javier
		Coche cocheJavier = new Coche ("2196CBW","Porsche","911","Black" );
		cocheJavier.acelerar(50);
		cocheJavier.frenar(23);
		
		System.out.println(cocheJavier.estadoCoche());
		
		
	}

}
