package Care.DI.Ex01.DTO;

public class HelloBean {
	private String hello;

	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public void Display(){
		System.out.println(hello);
	}
}
