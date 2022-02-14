package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("springtest.xml");
		
		Employee employee1 = (Employee) classPathXmlApplicationContext.getBean("employeeGetterSetter");
		System.out.println(employee1);
		
		Employee employee2 = (Employee) classPathXmlApplicationContext.getBean("employeeConstructor");
		System.out.println(employee2);
		
		Laptop laptop1=(Laptop) classPathXmlApplicationContext.getBean("laptopGetterSetter");
		System.out.println(laptop1);
		
		Laptop laptop2=(Laptop) classPathXmlApplicationContext.getBean("laptopConstructor");
		System.out.println(laptop2);
		
	
	}

}
