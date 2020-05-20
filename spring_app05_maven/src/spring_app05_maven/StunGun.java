package spring_app05_maven;

public class StunGun implements Weapon {

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
	public void use() {
		System.out.println("지이이잉");
		bullet =0;
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
