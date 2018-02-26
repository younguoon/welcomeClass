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
	
}
