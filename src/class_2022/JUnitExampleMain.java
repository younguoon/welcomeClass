package class_2022;

public class JUnitExampleMain {

	private int num = 0;
	
	public JUnitExampleMain(int num){
		this.num = num;
	}
	
	public int add(int num){
		this.num += num;
		return this.num;
	}
}
