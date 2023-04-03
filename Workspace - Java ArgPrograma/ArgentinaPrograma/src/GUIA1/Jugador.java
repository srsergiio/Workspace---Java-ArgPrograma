package GUIA1;

public class Jugador {
	
	
	/*En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre,
	puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice
	todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el
	método main de la clase principal del proyecto crear un Jugador utilizando el constructor
	vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad
	“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno
	de sus atributos.*/
	
	String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	int puntaje;
	String nacionalidad;
	int edad;
	
	public Jugador() { //contru vacio
		 nombre="";
		 puntaje=0;
		 nacionalidad="";
		 edad=0;
		
	}
	
	public void Jugador(String n,int p,String na,int e) { //contru inicializador
		 nombre=n;
		 puntaje=p;
		 nacionalidad=na;
		 edad=e;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador();
		jugador1.Jugador("Juan",140,"Argentina",29);
		
		System.out.print("nombre : "+jugador1.getNombre()+" Puntos : "+jugador1.puntaje+" Nacionalidad : "+jugador1.nacionalidad+" EDAD : "+jugador1.edad);
		
		
	}

	

}
