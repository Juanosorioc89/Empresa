package operaciones;

import java.util.List;

import modelos.Empleado;

public class OperacionEmpleado implements IOperacionEmpleado {

	private List<Empleado> empleados;
	
	@Override
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		
	}

	@Override
	public List<Empleado> listarEmpleados() {
		return empleados;
	}

	@Override
	public Empleado buscarEmpleadoPorDocumento(String documento) {
		for(Empleado empleado : empleados) {
			if(empleado.getDocumento().equals(documento)) {
				return empleado;
			}
		}
			
		return null;
	}

	@Override
	public double calcularSueldo(Empleado empleado) {
		return empleado.getSueldoHora();
	}

	@Override
	public int contarEmpleados() {
		return empleados.size();
	}

	
	
	
}
