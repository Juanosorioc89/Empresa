package operaciones;

import java.util.List;

import modelos.Empleado;

public interface IOperacionEmpleado {
	
	void agregarEmpleado(Empleado empleado);
	
	List<Empleado> listarEmpleados();
	
	Empleado buscarEmpleadoPorDocumento(String documento);
	
	double calcularSueldo(Empleado empleado);
	
	int contarEmpleados();
	
}
