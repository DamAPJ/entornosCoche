

public class Principal {
//COCHEEE
	public static void main(String[] args) {
		//Coche de Pilar
		Coche cochePilar = new Coche("5544PJk", "Tesla", "Model X", "White" );
		
		cochePilar.acelerar();
		cochePilar.acelerar();
		
		System.out.println(cochePilar.estadoCoche());
		
		//Coche Javier
		Coche cocheJavier = new Coche ("2196CBW","Porsche","911","Black" );
		cocheJavier.acelerar(50);
		cocheJavier.frenar(23);
		
		System.out.println(cocheJavier.estadoCoche());
		
		
	}

}
