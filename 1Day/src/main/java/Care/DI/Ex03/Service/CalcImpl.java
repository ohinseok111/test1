package Care.DI.Ex03.Service;

import java.util.List;

/**
 * 
 * @author infiscap
 *합계와 평균을 구하는 클래스
 */
public class CalcImpl {
	private int sum;
	private int cnt;
	private double avg;
	//생성자
	public CalcImpl() {
		sum=0;
		cnt=0;
		avg=0.0;
	}
	private void CalcSum(List<Integer> lst){
		cnt = lst.size();	//lst의 개수 저장
		//입력 받은 모든 수 합구하기
		for(Integer n : lst)
			sum += n;		
	}
	private void CalcAvg(){
		try{
			avg = (double)sum / (double)cnt;
		}catch(Exception e){
			avg=0.0;
		}
	}
	public void Display(List<Integer> lst){
		CalcSum(lst);
		CalcAvg();
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}





