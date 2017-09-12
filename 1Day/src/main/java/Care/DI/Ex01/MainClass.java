package Care.DI.Ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import Care.DI.Ex01.DTO.HelloBean;
import antlr.CppCodeGenerator;
import javassist.ClassPath;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:HelloBeanCTX.xml";
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLoc);
		HelloBean hello = 
				ctx.getBean("helloBean",
						HelloBean.class);
		hello.Display();
		
		HelloBean hello2 = 
				ctx.getBean("helloBean2",
						HelloBean.class);
		hello2.Display();
		
		if(hello.equals(hello2)){
			System.out.println("==");
		}else{
			System.out.println("!=");
		}
	}
	
}




