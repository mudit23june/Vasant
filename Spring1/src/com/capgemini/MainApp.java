package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		//@SuppressWarnings("unused")
		//Employee emp2 = context.getBean("emp", Employee.class);
		System.out.println(emp.getEmpNumber());
		System.out.println(emp.getName());

	}

}
