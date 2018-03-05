package class_0226;

public class VendingMachine {

	// 현재 금액을 가지고 있음
	private int money = 0;
	
	private int billsOf1000 = 0;
	private int coinsOf500 = 0;
	private int coinsOf100 = 0;
	private int coinsOf50 = 0;
	private int coinsOf10 = 0;
	
	
	public void inputMoney(int money) {
		this.money = money;
	}

	public int showMoney() {
		return this.money;
	}

	public void chooseProduct(int price) {
		this.money -= price;
	}

	public int billsToReturn() {
		int bills = this.money / 1000;
		this.money -= bills*1000;
		return bills;
	}

	public int coinsOf500ToReturn() {
		int coinsOf500 = this.money / 500;
		this.money -= 500 * coinsOf500;
		return coinsOf500;
	}

	public int coinsOf100ToReturn() {
		int coinsOf100 = this.money / 100;
		this.money -= 100 * coinsOf100;
		return coinsOf100;
	}

	public int coinsOf50ToReturn() {
		int coinsOf50 = this.money / 50;
		this.money -= 50 * coinsOf50;
		return coinsOf50;
	}

	public int coinsOf10ToReturn() {
		int coinsOf10 = this.money / 10;
		this.money -= 10 * coinsOf10;
		return coinsOf10;
	}

	public void calculate() {
		this.billsOf1000 = this.billsToReturn();
		this.coinsOf500 = this.coinsOf500ToReturn();
		this.coinsOf100 = this.coinsOf100ToReturn();
		this.coinsOf50 = this.coinsOf50ToReturn();
		this.coinsOf10 = this.coinsOf10ToReturn();
	}

	public void display() {
		System.out.println("1000원 : "+this.billsOf1000);
		System.out.println("500원 : "+this.coinsOf500);
		System.out.println("100원 : "+this.coinsOf100);
		System.out.println("50원 : "+this.coinsOf50);
		System.out.println("10원 : "+this.coinsOf10);
		
	}
}


