package class_0226;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vm;
	
	@Before
	public void setUp(){
		vm = new VendingMachine();
	}
	
	@Test
	public void test() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
	}

	@Test
	public void test_상품을_선택하면_입금액에서_상품가격을_리턴(){
		vm.inputMoney(2000);
		vm.chooseProduct(1350);
		assertEquals(2000-1350, vm.showMoney());
	}
	
	@Test
	public void test_잔액이_1000원이상인경우_1000원지폐를_지급받아야_한다(){
		vm.inputMoney(3000);
		vm.chooseProduct(1350);
		int bills = (3000 - 1350) / 1000;
		int coins = (3000 - 1350) - (1000*bills);
		assertEquals(bills, vm.billsToReturn());
		assertEquals(coins, vm.showMoney());
	}
	
	@Test
	public void test_잔액이_1000원미만인경우(){
		vm.inputMoney(2000);
		vm.chooseProduct(1350);
		assertEquals(0, vm.billsToReturn());
	}
	
	@Test
	public void test_잔액이_1000원미만_500원이상인경우_500원동전을_지급(){
		vm.inputMoney(1000);
		vm.chooseProduct(350);
		int coinsOf500 = (1000-350) / 500;
		assertEquals(1, vm.coinsOf500ToReturn());
		assertEquals(150, vm.showMoney());
		
	}
	@Test
	public void test_잔액이_500원미만_100원이상인경우_100원동을_지금(){
		vm.inputMoney(500);
		vm.chooseProduct(350);
		int coinsOf100 = (500-350) / 100;
		assertEquals(1, vm.coinsOf100ToReturn());
		assertEquals(50, vm.showMoney());
	}
	
	@Test
	public void test_잔액이_100원_미만인경우_500원_동전은_없음(){
		vm.inputMoney(400);
		vm.chooseProduct(350);
		assertEquals(0, vm.coinsOf100ToReturn());
	}
	
	@Test
	public void test_잔액이_100원미만_50원이상인경우_50원동을_지금(){
		vm.inputMoney(400);
		vm.chooseProduct(330);
		int coinsOf100 = (400-330);
		assertEquals(1, vm.coinsOf50ToReturn());
		assertEquals(20, vm.showMoney());
	}

	@Test
	public void test_잔액이_50원미만인경우_50원동은_없음(){
		vm.inputMoney(400);
		vm.chooseProduct(370);
		int coinsOf100 = (400-370);
		assertEquals(3, vm.coinsOf10ToReturn());
	}
	
	@Test
	public void test_잔액이_50원미만인경우_10원동을_지금(){
		vm.inputMoney(400);
		vm.chooseProduct(370);
		int coinsOf100 = (400-370);
		assertEquals(3, vm.coinsOf10ToReturn());
		assertEquals(0, vm.showMoney());
	}
	
	@Test
	public void test_잔액이_1000원이상인_경우(){
		vm.inputMoney(3000);
		vm.chooseProduct(1340);
		vm.calculate();
		vm.display();
		
	}
}


