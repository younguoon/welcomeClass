package welcomeJavaClass;

public class Main {

	public static void main(String[] args) {
		do {
			System.out.println("do");
			continue;
		} while (false);
		System.out.println("while");

		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}
}
