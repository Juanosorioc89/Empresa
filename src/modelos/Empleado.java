package modelos;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private String documento;
	private double SueldoHora;
	
	public Empleado(String nombre, String apellido, String documento, double sueldoHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		SueldoHora = sueldoHora;
	}

	public Empleado() {
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSueldoHora() {
		return SueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		SueldoHora = sueldoHora;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", SueldoHora="
				+ SueldoHora + "]";
	}

}
