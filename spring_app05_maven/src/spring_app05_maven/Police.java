package spring_app05_maven;

public class Police implements Character {

	Weapon w;
	StunGun sg;
	
	int hp;
	
	public Police() {
		this.hp = 100;
	}
	
	public Police(Weapon w, int hp) {
		this.w=w;
		this.hp=hp;
	}
	
	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public StunGun getSg() {
		return sg;
	}

	public void setSg(StunGun sg) {
		this.sg = sg;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public void walk() {
		System.out.println("저벅저벅");
	}

	@Override
	public void eat(String it) {
		System.out.println(it + "는 맛있다");
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj + " 공격");
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj + "를 주웠다");
	}

}
