package Abstract;

public class Calci implements Calculator {
	public int add(int x, int y) {
		// TODO Auto-generated method stub

		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public long multi(long x, long y) {
		// TODO Auto-generated method stub
		return x * y;

	}

}
