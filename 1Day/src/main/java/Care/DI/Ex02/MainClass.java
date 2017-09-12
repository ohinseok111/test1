package Care.DI.Ex02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import Care.DI.Ex02.DTO.HelloBean;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:Ex02HelloBeanCTX.xml";
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLoc);
		HelloBean hello = 
				ctx.getBean("helloBean",
						HelloBean.class);
		hello.Display();
	}
	
}





