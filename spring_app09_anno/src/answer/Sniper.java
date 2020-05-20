package answer;

public class Sniper implements Character {
	
	Weapon w;
	Rifle rf;
	StunGun sg;
	
	int hp;
	
	public Sniper() {
		// TODO Auto-generated constructor stub
		this.hp = 100;
	}
	
	public Sniper(Weapon w, int hp) {
		this.w = w;
		this.hp = hp;
	}
	
	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public Rifle getRf() {
		return rf;
	}

	public void setRf(Rifle rf) {
		this.rf = rf;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public StunGun getSg() {
		return sg;
	}

	public void setSg(StunGun sg) {
		this.sg = sg;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("살금살금 걷는다");
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println(it + " 을 냠냠");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "을 조준하고 호흡을 멈추고 탕 쏜다");
		w.use();		
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("게또다제");
	}

}
