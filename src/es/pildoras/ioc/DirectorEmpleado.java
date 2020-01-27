package es.pildoras.ioc;

public class DirectorEmpleado implements Empleados {

	private CreacionInformes informenuevo;
	
	public DirectorEmpleado(CreacionInformes informe) {
	
		this.informenuevo = informe;
	}
	
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el director : "+informenuevo.getInformes();
	}

}
