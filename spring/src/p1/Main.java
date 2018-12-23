package p1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Setter Dependency Injection
 *
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("actionContext.xml");
		Employee e = (Employee) ac.getBean("id1");
		System.out.println(e.getCompany_name());

	}

}
