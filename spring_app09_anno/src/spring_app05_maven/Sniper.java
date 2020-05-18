package spring_app05_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sniper implements Character{

	int hp;
//	@Autowired Weapon sr;
//	@Qualifier("internal")
	@Autowired
	Weapon w;
//	SniperGun sr;
//	StunGun sg;
	
	public Sniper() {
		this.hp = 1;
	}
	
	public Sniper(int hp) {
		this.hp = hp;
	}
	
	@Override
	public void walk() {
		
	}

	@Override
	public void eat(String it) {
		
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj+"을(를) "+w.getName()+"으로 숨을 멈추고 "+w.use() +" 쏜다");
//		sr.use();
		
	}

	@Override
	public void get(Object obj) {
		
	}

}
