package tp1.ejercicio3;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String email;
	
	public Persona(String unNombre, String unApellido, String unEmail) {
		setNombre(unNombre);
		setApellido(unApellido);
		setEmail(unEmail);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		String aux = "nombre: " + getNombre() + " apeliido: " + getApellido() + " email: " + getApellido();
		return aux;
	}
	
}
