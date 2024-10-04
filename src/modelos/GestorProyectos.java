package modelos;

public class GestorProyectos extends Empleado{
	
	private String area;


	public GestorProyectos(String nombre, String apellido, String documento, int sueldoHora, String area) {
		super(nombre, apellido, documento, sueldoHora);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
