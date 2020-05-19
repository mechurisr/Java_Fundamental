package java_20200519;

public class Child extends Parent{
	String chicken;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	public void play(String starcraft) {
		System.out.println("Child play()");
	}
	
	public void setParentMoney(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}
}
