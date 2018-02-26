package class_0219;

public class Calculator {
	
	public int sum(int num1, int num2){
		return num1+num2;
	}
	public int fac(int n){
//		귀납조건 : 무한재귀에 빠지지 않기위해선 조건을 설정해주어야 함
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(n<=1)
			return 1;
		return n*fac(n-1);
	}

	
}
