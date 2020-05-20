package spring_app01;

public class HelloFr implements Hello{

	@Override
	public void sayHello(String name) {
		System.out.println("Bonjour~! "+name+".");
	}

}
