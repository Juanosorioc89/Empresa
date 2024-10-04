package main;

import java.util.List;

import javax.swing.JOptionPane;

import modelos.*;
import operaciones.OperacionEmpleado;
import operaciones.OperacionEmpresa;

public class Main {
	public static void main(String[] args) {
		OperacionEmpresa operacionEmpresa = new OperacionEmpresa();
		OperacionEmpleado operacionEmpleado = new OperacionEmpleado();

		while(true) {
			String menu = "1. Agregar Empresa\n" +
					"2. Listar Empresas\n" +
					"3. Agregar Empleado\n" +
					"4. Listar Empleados\n" +
					"5. Buscar empleado por documento\n" +
					"6. Calcular sueldo de empleado\n" +
					"7. Contar Empleados\n" +
					"8. Salir";

			String opcion = JOptionPane.showInputDialog(menu);

			switch (opcion) {
			case "1":
				String nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
				String nitEmpresa = JOptionPane.showInputDialog("Ingrese el nit de la empresa:");
				String direccionEmpresa = JOptionPane.showInputDialog("Ingrese la direccion de la empresa:");
				String ciudadEmpresa = JOptionPane.showInputDialog("Ingrese la ciudad de la empresa:");
				operacionEmpresa.agregarEmpresa(new Empresa(nombreEmpresa, nitEmpresa, direccionEmpresa, ciudadEmpresa));
				break;

			case "2":
				List<Empresa> empresas = operacionEmpresa.listarEmpresas();
				StringBuilder listaEmpresas = new StringBuilder ("Empresas:\n");
				for ( Empresa empresa : empresas) {
					listaEmpresas.append(empresa.getNombre()).append("\n");
				}
				JOptionPane.showConfirmDialog(null, listaEmpresas.toString());
				break;

			case "3":
				String nombreEmpleado = JOptionPane.showInputDialog("Ingrese en nombre del empleado:");
				String apellidoEmpleado = JOptionPane.showInputDialog("Ingrese en apellido del empleado:");
				String documentoEmpleado = JOptionPane.showInputDialog("Ingrese el documento del empleado:");
				double sueldoHoraEmpleado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo hora del empleado:"));
				operacionEmpleado.agregarEmpleado(new Empleado(nombreEmpleado, apellidoEmpleado, documentoEmpleado, sueldoHoraEmpleado));
				break;

			case "4":
				List<Empleado> empleados = operacionEmpleado.listarEmpleados();
				StringBuilder listaEmpleados = new StringBuilder ("Empleados:\n");
				for(Empleado empleado : empleados) {
					listaEmpleados.append(empleado.toString()).append("\n");
				}
				JOptionPane.showConfirmDialog(null, listaEmpleados.toString());

			case "5":
				String docBuscar = JOptionPane.showInputDialog("Ingrese el documento del empleado a buscar");
				Empleado encontrado = operacionEmpleado.buscarEmpleadoPorDocumento(docBuscar);
				if ( encontrado != null) {
					JOptionPane.showConfirmDialog(null, "Empleado encontrado: " + encontrado.toString());
				} else {
					JOptionPane.showConfirmDialog(null, "Empleado no encontrado.");
				}
				break;

			case "6":
				String docSueldo = JOptionPane.showInputDialog("Ingrese el numero de documento de empleado para calcular el sueldo: ");
				Empleado empleadoSueldo = operacionEmpleado.buscarEmpleadoPorDocumento(docSueldo);
				if(empleadoSueldo != null) {
					double sueldoCalculado = operacionEmpleado.calcularSueldo(empleadoSueldo);
					JOptionPane.showConfirmDialog(null, "sueldo: " + sueldoCalculado);
				} else {
					JOptionPane.showConfirmDialog(null, "Empleado no encontrado.");
				}
				break;

			case "7":
				int cantidadEmpleados = operacionEmpleado.contarEmpleados();
				JOptionPane.showConfirmDialog(null, "cantidad de Empleados: " + cantidadEmpleados);
				break;

			case "8":
				System.exit(0);
				break;

			default: 
				JOptionPane.showConfirmDialog(null, "Opción no válida");
				break;
			}

		}
	}
}