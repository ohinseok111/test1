package Care.DI.Ex02.DTO;

import Care.DI.Ex02.Service.HelloImpl;

public class HelloBean {
	private String hello;
	private HelloImpl helloImpl;
	
	public HelloImpl getHelloImpl() {
		return helloImpl;
	}
	public void setHelloImpl(HelloImpl helloImpl) {
		this.helloImpl = helloImpl;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public void Display(){
		helloImpl.Display(hello);
	}
}
