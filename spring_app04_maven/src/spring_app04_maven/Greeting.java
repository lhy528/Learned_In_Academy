package spring_app04_maven;

public class Greeting implements Message {

	@Override
	public void sayHello(String str) {
		System.out.println(str);
	}

}
