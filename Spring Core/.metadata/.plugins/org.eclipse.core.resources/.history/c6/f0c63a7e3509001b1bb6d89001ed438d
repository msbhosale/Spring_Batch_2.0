package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.model.Date;
import in.happycoding.model.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			
		Employee theEmployee =  (Employee) context.getBean("employee");
		
		System.out.println(theEmployee);
	}
}