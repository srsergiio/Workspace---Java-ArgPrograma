package GUIA1;

public class Perro {

	
	/*En nuevo proyecto crear una clase de nombre Perro, cuyos atributos son: nombre, raza,
	peso y edad. La clase tendrás un constructor que permita inicializar todos sus atributos y
	los métodos getter y setter. Además agregaremos un método adicional de nombre
	mostrarInfo que visualizará por consola todos los datos de este animal. Por último, desde
	el método main de la clase principal del proyecto usted creará un Perro de nombre “Olivia”
	de raza “Buldog Francés” que pese 1.2Kg con 1 año de edad; en la línea siguiente invocará
	el método mostrarInfo de la instancia creada anteriormente.*/
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	String nombre;
	String raza;
	double peso;
	int edad;
	
	public void Perro() {
		nombre="";
		raza="";
		peso=0;
		edad=0;
	}
	
	public void Perro(String n,String r, double p, int e) {
		nombre=n;
		raza=r;
		peso=p;
		edad=e;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro perroUNO = new Perro();
		perroUNO.Perro("Olivia","Buldog Francés", 1.2 , 1);
		
		System.out.println(perroUNO.edad);
		
		perroUNO.setEdad(3);
		
		System.out.println(perroUNO.edad);
		

	}

}
