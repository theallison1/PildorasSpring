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

}
