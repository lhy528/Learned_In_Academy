package answer;

public class Rifle implements Weapon {
	int bullet = 0;
	
	public Rifle() {
		this.bullet = 6;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet > 0 ) {
			System.out.println("빵야~");
			bullet --;
		}
		else {
			System.out.println("재장전이 필요합니다");
			reuse();
		}
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("리로드!");
		bullet = 6;
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("총을 잃어버렸다.");
		bullet = 0;
	}
}
