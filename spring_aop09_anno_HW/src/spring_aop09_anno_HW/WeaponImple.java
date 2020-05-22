package spring_aop09_anno_HW;

public class WeaponImple implements Weapon {
	String type;
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void fire() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(type+"을(를) 사용해 공격했다");
	}

	@Override
	public void reload() {
		System.out.println("재장전!");
	}

}
