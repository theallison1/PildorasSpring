package es.pildoras.ioc;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	private String nombreEmpresa;
	private String email;
	
	
	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la agenda de los jefes";
	}

	public CreacionInformes getInformeNuvo() {
		return informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe generado por el secretario  :"+informeNuevo.getInformes();
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
