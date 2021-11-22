
public class Usuario {
	String nombre;
	String dni;
	int edad;
	
	public Usuario() {
		this.nombre="";
		this.dni ="";
		this.edad = 0;
		
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		return "Nombre:  " + this.nombre + "\n" + "Edad: " + this.edad + "\n" + "Dni: " + this.dni;
	}


}

