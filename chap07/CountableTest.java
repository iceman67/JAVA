package challenge.three;

abstract class Countable {
	String name;
	protected int num;

	abstract void count();

	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class Bird extends Countable {
	public Bird(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + " has " + num);
	}

	public void fly() {
		System.out.println(num + " birds (" + name + ") flying");
	}
}

class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + " has " + num );
	}

	public void ripen() {
		System.out.println(num + " trees (" + name + ") ripen");
	}
}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = {new Bird("Cuckoo", 5), new Bird("Eagle", 2),
				new Tree("Apple", 10), new Tree("Chestnat", 7)};

		for (Countable e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Bird)
				((Bird) m[i]).fly();
			else
				((Tree) m[i]).ripen();
		}
	}
}
