package es.pildoras.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//creacion de objetos
		
//		Empleados jefe = new JefeEmpleados();
//		
//		Empleados dir = new DirectorEmpleado();
		
//		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/beans/applicationContext.xml");
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("com/beans/applicationContext.xml");
		
		SecretarioEmpleado Jose = contex.getBean("miSecretario",SecretarioEmpleado.class);
		
		System.out.println(Jose.getEmail());
		//uso de objetos creados
		
		//Empleados Juan = app.getBean("miEmpleado",Empleados.class);
		
//		System.out.println(Juan.getTareas());
//		System.out.println(Juan.getInformes());
//		app.close();
//		System.out.println(jefe.getTareas());
//		System.out.println(dir.getTareas());
		
		
		//SecretarioEmpleado Maria = app.getBean("miSecretario",SecretarioEmpleado.class);
//		
//		System.out.println(Maria.getTareas());
//		System.out.println(Maria.getInformes());
//		System.out.println("el mail de la empresa es: "+Maria.getEmail());
//		System.out.println("el nombre de la empresa es: "+Maria.getNombreEmpresa());
//		
//		JefeEmpleados Pablo = app.getBean("miEmpleado",JefeEmpleados.class);
//		System.out.println("el mail de Pablo es:"+Pablo.getEmail());
//		
		contex.close();
	}

}
