package es.pildoras.ioc;

public class JefeEmpleados implements Empleados {

	private CreacionInformes informesNuevos;
	private String email;
	private String nombreEmpresa;
	
	
	
	public CreacionInformes getInformesNuevos() {
		return informesNuevos;
	}
	public void setInformesNuevos(CreacionInformes informesNuevos) {
		this.informesNuevos = informesNuevos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public JefeEmpleados(CreacionInformes informes) {
		this.informesNuevos = informes;
	}
	public String getTareas()  {
		
		return "Gestionó las cuestiones respectivas a los empleados";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el JEfe :"+informesNuevos.getInformes();
	}
}
