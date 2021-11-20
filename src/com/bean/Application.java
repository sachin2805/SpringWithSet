package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("spring.xml");
			CriketTeam cri=(CriketTeam)c.getBean("ct1");
			cri.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
/*OUTPUT :
India	Ravi
7	Dhoni
18	Virat
45	Rohit
*/