package sec02;

public class TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("Last element  :  " + array[3]);
			System.out.println("First element  :  " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			//System.out.println("There is no element");
		}
		System.out.println("Oops!");
	}
}