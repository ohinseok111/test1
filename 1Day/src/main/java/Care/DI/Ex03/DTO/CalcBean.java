package Care.DI.Ex03.DTO;

import java.util.ArrayList;
import java.util.List;

import Care.DI.Ex03.Service.CalcImpl;

/**
 * 
 * @author infiscap
 * 누가 질문한 두 수 입력 클래스
 */
public class CalcBean {
	private int num1;
	private int num2;
	private CalcImpl calcImpl;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public CalcImpl getCalcImpl() {
		return calcImpl;
	}
	public void setCalcImpl(CalcImpl calcImpl) {
		this.calcImpl = calcImpl;
	}
	public void Display(){
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(num1);
		lst.add(num2);
		
		calcImpl.Display(lst);
	}
}





