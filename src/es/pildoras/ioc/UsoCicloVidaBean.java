package es.pildoras.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/beans/applicationContext3.xml");
		
		SecretarioEmpleado Roberto = app.getBean("miSecretario",SecretarioEmpleado.class);
		
		System.out.println(Roberto.getTareas());
		app.close();

	}

}
