package spring_app05_maven;

public class SniperGun implements Weapon {

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
	public void use() {
		System.out.println("탕");
		bullet =0;
		System.out.println(name);
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
