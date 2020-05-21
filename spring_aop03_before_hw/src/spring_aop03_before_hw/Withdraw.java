package spring_aop03_before_hw;

public class Withdraw implements Bank {
	int lastmoney, transfermoney;
	String owner;
	
	public int getLastmoney() {
		return lastmoney;
	}

	public int getTransfermoney() {
		return transfermoney;
	}

	public String getOwner() {
		return owner;
	}

	public void setLastmoney(int lastmoney) {
		this.lastmoney = lastmoney;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void transfer(int money) {
		// TODO Auto-generated method stub
		System.out.println("계좌이체를 시작합니다");
		lastmoney -= money;
		System.out.println(owner+" 계좌에서 "+ money+"원 출금되었습니다.");
		System.out.println("잔액은 "+lastmoney+"원 입니다.");
	}

}
