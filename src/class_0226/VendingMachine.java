package class_0226;

public class VendingMachine {

	// 현재 금액을 가지고 있음
	private int money = 0;
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

}
