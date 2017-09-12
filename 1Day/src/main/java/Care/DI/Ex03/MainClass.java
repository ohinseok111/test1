package Care.DI.Ex03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Care.DI.Ex03.DTO.CalcBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ctxLoc = "Ex03CalcNumCTX.xml";
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext(ctxLoc);
		
		CalcBean calc = (CalcBean)ctx.getBean("calcBean");
		
		calc.Display();
	}

}






