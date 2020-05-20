package answer;

public class StunGun implements Weapon{
	
	int bullet;
	
	public StunGun() {
		this.bullet = 1;
	}
	
	@Override
	public void use() {
		System.out.println("내 주먹은 스턴건!! 지이이잉~");
		bullet --;
	}

	@Override
	public void reuse() {
		System.out.println("장전이 필요없지만 해본다");
		bullet ++;
	}

	@Override
	public void drop() {
		System.out.println("스턴건 충전 중..");
		bullet = 0;
	}
	
}
