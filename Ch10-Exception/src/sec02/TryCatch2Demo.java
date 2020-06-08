package sec02;

public class TryCatch2Demo {
	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There is no element.");
		} catch (NumberFormatException e) {
			System.out.println("It is not a number.");
		} catch (ArithmeticException e) {
			System.out.println("Dive by zero.");
		} finally {
			System.out.println("Always execution");
		}
		System.out.println("Termination");
	}
}