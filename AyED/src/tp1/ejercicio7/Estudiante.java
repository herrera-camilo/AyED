package tp1.ejercicio7;

public class Estudiante extends Persona{
	
	private int comision;
	private String direccion;
	
	public Estudiante(String unNombre,String unApellido,String unEmail, int unaComision, String unaDireccion) {
		super(unNombre,unApellido,unEmail);
		setComision(unaComision);
		setDireccion(unaDireccion);
	}
	
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		String aux = super.toString() + " comision: " + getComision() + " direccion: " + getDireccion();
		return aux;
	}
	
	
	
}
