package class_0222;

public class StringCalculator {

	public static int add(String number) {
		// 일단 공백 제거(일관된 포멧으로 변경)
		number = number.trim();
		if("".equals(number)){
			return 0;
		}
		
		
		String[] numbers = number.split(",");
		int sum = 0;
		for (String no : numbers) {
			sum += Integer.parseInt(no);
		}
		return sum;
	}
}
