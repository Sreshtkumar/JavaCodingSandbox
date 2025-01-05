package com.mySpringBootApp.demo;

import com.mySpringBootApp.demo.beans.Customer;
import com.mySpringBootApp.demo.beans.Emp;
import com.mySpringBootApp.demo.beans.ReadCustomProperties;
import com.mySpringBootApp.demo.controller.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		/*String[] str = context.getBeanDefinitionNames();
		for(String i: str)
		{
			System.out.println(i);
		}*/
		//WelcomeController obj = (WelcomeController)context.getBean("welcomeController");
		WelcomeController obj = context.getBean("welcomeController", WelcomeController.class);
		obj.display();

		Emp obj2 = context.getBean("emp", Emp.class);
		obj2.disp();

		Customer obj3 = context.getBean("customer", Customer.class);
		obj3.display();

		ReadCustomProperties obj4 = context.getBean("readCustomProperties", ReadCustomProperties.class);
		obj4.display();

	}

}
