package spring_app01;

public class HelloUS implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name+"~!");
	}
	
}
