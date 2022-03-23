package AccessSpecifier;

public class Parent {
	int x = 5;
	protected int y = 10;
	public int z = 3;
	private int d = 25;

	public void add() {
		System.out.println(x + y);

	}

	private void sub() {
		System.out.println(y - z);
	}

	protected void multi() {
		System.out.println(z * d);
	}

}
