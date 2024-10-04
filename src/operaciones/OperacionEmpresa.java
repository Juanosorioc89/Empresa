package operaciones;

import java.util.List;

import modelos.Empresa;

public class OperacionEmpresa implements IOperacionEmpresa{

	private List<Empresa> empresas;

	@Override
	public void agregarEmpresa(Empresa empresa) {
		empresas.add(empresa);
		
	}

	@Override
	public List<Empresa> listarEmpresas() {
		// TODO Auto-generated method stub
		return empresas;
	}
	
	
	


}
