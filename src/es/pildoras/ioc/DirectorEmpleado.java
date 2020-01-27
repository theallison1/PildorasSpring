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

	//M�todo init. Ejecutar tareas antes de que el bean est� disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init . aqui  irian las tareas a ejecutar "+
	"antes del que el beans este listo");
	}
	 
	
	//m�todo destroy . Ejecutar tareas despu�s  de que el bean  haya sido  
	
	public void metodoFinal() {
		System.out.println("Dentro del metodo Destroy . aqui  irian las tareas a ejecutar "+
	"despues de que muera el bean");
	}
	 
}
