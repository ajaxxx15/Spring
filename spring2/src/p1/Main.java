package p1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Constructor Dependency Injection
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("actionContext.xml");

		Employee e = (Employee) ac.getBean("b");

		e.disp();

	}

}
