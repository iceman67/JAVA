public class IncrementDemo {
	public static void main(String[] args) {
		int[] x = { 0 };
		System.out.println("호출전  x[0] = " + x[0]);

		increment(x);
		System.out.println("호출후 x[0] = " + x[0]);
	}

	public static void increment(int[] n) {
		System.out.print("increment() 메소드 안에서 ");
		System.out.print("n[0] = " + n[0] + " ---> ");
		n[0]++;
		System.out.println("n[0] = " + n[0]);
	}
}