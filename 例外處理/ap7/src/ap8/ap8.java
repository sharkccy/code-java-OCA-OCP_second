package ap8;

public class ap8 {

	public static void main(String[] args) {
		divide(3);
		
	}
	public static void divide(int n) {
		try {
			System.out.println(5 / n);
		}
		catch(ArithmeticException e) {
			System.out.println("分母不可為0");
		}
	}
}
