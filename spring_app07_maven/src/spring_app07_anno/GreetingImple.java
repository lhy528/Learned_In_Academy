package spring_app07_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingImple implements Greeting {
	String msg;
	
	@Autowired 			// 필요한 곳에 자동으로 묶기 => xml에 새로운 bean 필요 => main에 factory도 변경해줘야 함
	NowTime nt;
	
	public GreetingImple() {
	}
	public GreetingImple(String msg) {
		this.msg = msg;
	}
	// 데이터 전송(생성자 or setter)
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public NowTime getNt() {
		return nt;
	}
	public void setNt(NowTime nt) {
		this.nt = nt;
	}
	
	@Override
	public void printMsg() {
		System.out.println("현재시각 : "+nt.getTime());
		System.out.println("msg : "+msg);
	}
}
