package class_0222;

public class Factorial {
	public int calc(int i){
		if(i < 0)
			throw new RuntimeException();

		if(i < 2)
			return 1;
		
	return i * calc(i - 1);	
	}
}

