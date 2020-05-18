package spring_app05_maven;

import org.springframework.beans.factory.annotation.Qualifier;

public class SniperGun implements Weapon {
//	@Qualifier("internal")
//	Weapon w;

	int bullet = 0;
	String name = "저격총";
	
	public SniperGun() {
		this.bullet = 6;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String use() {
		bullet =0;
		return "탕";
	}

	@Override
	public void reuse() {
		System.out.println("처컥");
		bullet = 1;
	}

	@Override
	public void drop() {
		System.out.println("오퍼 떨굼");
		bullet = 0;
	}

}
