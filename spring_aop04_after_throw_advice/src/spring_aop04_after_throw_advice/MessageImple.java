package spring_aop04_after_throw_advice;

public class MessageImple implements Message {
	// 메세지는 DI로 추가
	String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void printMsg() {
		System.out.println("출력 메세지 : "+msg);
	}

	@Override
	public void printThrowMessage() {
		throw new IllegalArgumentException();
	}

}
