package es.pildoras.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/beans/applicationContext.xml");
		
		SecretarioEmpleado Maria = app.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = app.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado Juan = app.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado Ana = app.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado Manolo = app.getBean("miSecretario",SecretarioEmpleado.class);
		
		System.out.println(Maria);
		
		System.out.println(Pedro);
		
		System.out.println(Juan);
		
		System.out.println(Ana);
		
		System.out.println(Manolo);
		
//		if(Maria == Pedro) System.out.println("apuntan al mismo objeto");
//		else System.out.println("no se trata del mismo objeto");
		
		
		app.close();
	}

}
