package sec02;

public class TryCatch3Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		} catch (Exception e) {
			System.out.println("Oops!!!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("There is no element.");
		}
		System.out.println("Termination.");
	}
}