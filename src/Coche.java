

public class Coche {
	//Propiedades privadas
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int velocidad = 0;
	
	
	//Constructor sin velocidad
	public Coche(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
	//Sobrecarga de constructores
	
	public Coche(String marca, String modelo,String color) {
		this.matricula = "Pendiente matricular";
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
	//si a una prop no le asignamos ningun valor, tendra
	//por defecto el valor que le asigne la maquina virtual de Java
	public Coche() {
		this.matricula = "Pendiente matricular";
		this.marca = "Opel";
		this.modelo = "Corsa";
		this.color = "Gris";
		this.velocidad = 0;
	}
	
	//Metodos
	
	public void acelerar() {
		this.velocidad = this.velocidad + 10;
	}
	
	public void frenar() {
		this.velocidad = this.velocidad - 10;
	}
	
	//nuevos metodos para acelerar y frenar
	//tenemos dos implementaciones para acelerar
	//y dos para frenar, no son nuevos metodods
	
	public void acelerar(int cuanto) {
		this.velocidad = this.velocidad + cuanto;
	}
	
	public void frenar(int cuanto) {
		this.velocidad = this.velocidad - cuanto;
	}
	
	
	
	public String estadoCoche() {
		return this.marca + " " + this.modelo + " "+ this.matricula + " "
		+ this.color + " va a una velocidad de "+ this.velocidad;
	}
	
	//Garbage collector, metodo para eliminar
	
	protected void finalize() {
		System.out.println("Se ha borrado el objeto");
	}
	
	
	
	
}
