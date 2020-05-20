package spring_app05_maven;

public class Sniper implements Character{

	int hp;
	Weapon w;
	SniperGun sr;
	
	public Sniper() {
		this.hp = 1;
	}
	
	public Sniper(Weapon w, int hp) {
		this.hp = hp;
		this.w = w;
	}
	
	@Override
	public void walk() {
		
	}

	@Override
	public void eat(String it) {
		
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj+"을(를) "+w.getName()+"으로 숨을 멈추고 탕 쏜다");
	}

	@Override
	public void get(Object obj) {
		
	}

}
