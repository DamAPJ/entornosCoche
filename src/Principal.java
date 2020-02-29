

public class Principal {
//COCHEEE
	public static void main(String[] args) {
		
		Coche miCoche = new Coche("5544PJk", "Alpha Romeo", "Nisu", "violeta" );
		
		miCoche.acelerar();
		miCoche.acelerar();
		
		System.out.println(miCoche.estadoCoche());
		
		//Objetos con referencia a objetos, van a la misma referencia de memoria
		Coche objCoche1 = new Coche("1111JPK","Audi","A7","Grisaceo");
		Coche objCoche2 = objCoche1;
		
		objCoche1.acelerar();
		objCoche1.acelerar(50);
		objCoche1.frenar();
		objCoche1.frenar(20);
		//objCoche2.acelerar();
		//objCoche2.acelerar();
		
		System.out.println("Mostrando info de objCoche1");
		System.out.println(objCoche1.estadoCoche());
		System.out.println("Mostrando info de objCoche2");
		System.out.println(objCoche2.estadoCoche());
		
		//eliminando objetos
		
		objCoche1 = null;
		objCoche2 = null;
		
		//Runtime comunica con la maq virtual de java
		Runtime garbage = Runtime.getRuntime();
		//metodo gc oblica a eliminar los objetos del garbaje collector
		garbage.gc();
		
		//Sobrecarga de constructores
		Coche c1 = new Coche();
		Coche c2 = new Coche("5544PJK", "Ford", "Fiesta", "Rojo");
		Coche c3 = new Coche("Suzuki", "Ignis", "Gris");
		System.out.println(c1.estadoCoche());
		System.out.println(c2.estadoCoche());
		System.out.println(c3.estadoCoche());
		
		
		
	}

}
