package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.model.HardDisc;
import in.happycoding.model.Laptop;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Laptop laptop = (Laptop) context.getBean("laptop");
		
		laptop.start();
		
	}
}