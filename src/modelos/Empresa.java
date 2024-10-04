package modelos;

public class Empresa {
	
	private String nombre;
	private String nit;
	private String direccion;
	private String ciudad;
	
	public Empresa(String nombre, String nit, String direccion, String ciudad) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public Empresa() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + ", ciudad=" + ciudad + "]";
	}
	
	
	
	

}
