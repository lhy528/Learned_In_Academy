package spring_app05_maven;

import org.springframework.beans.factory.annotation.Qualifier;

public class StunGun implements Weapon {
//	@Qualifier("external")
//	Weapon w;
	

	int bullet;
	String name = "스턴건";
	public StunGun() {
		this.bullet = 1;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String use() {
		bullet =0;
		return "지이이잉";
	}

	@Override
	public void reuse() {
		System.out.println("재충전");
		bullet = 1;
	}

	@Override
	public void drop() {
		System.out.println("충전기 보급좀...");
		bullet = 0;
	}

}
