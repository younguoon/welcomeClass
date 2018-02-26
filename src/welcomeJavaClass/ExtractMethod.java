package welcomeJavaClass;

import java.util.Enumeration;

public class ExtractMethod {
	private String name;
	private Orders orders;

	void printOwing() {
		printBanner();
		printDetail(getoutStanding());
	}

	private double getoutStanding() {
		Enumeration order = orders.elements();
		double outStanding = 0.0;

		// 외상액 계산
		while (order.hasMoreElements()) {
			Order each = (Order) orders.nextElement();
			outStanding += each.getAmount();
		}
		return outStanding;
	}

	private void printDetail(double outStanding) {
		// 세부 내역 출력
		System.out.println("고객명 : " + name);
		System.out.println("외상액 : " + outStanding);
	}

	private void printBanner() {
		// 배너 출력
		System.out.println("******************");
		System.out.println("*****고객 외상*****");
		System.out.println("******************");
	}

}
