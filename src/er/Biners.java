package er;

import java.util.Random;

public abstract  class Biners {
	static int maxshu = 100;
	static int maxsu = 50;
	int[] bean = new int[4];
	private int left = 0, over = 0;
	private int right = 0, mid = 0;

	public static int random() {
		Random c = new Random();
		int n = c.nextInt(maxshu + 1);
		return n;
	}

	public void generate(int anoperator) {

		int lefts, rights;
		do {
			lefts = random();
			rights = random();
			bean = calculate(lefts, rights);
		} while (!check(bean[3]));
		left = bean[0];
		right = bean[1];
		mid = anoperator;
		over = bean[3];
	}


	  abstract boolean check(int over); 
	  abstract int[] calculate(int left,int right);

	public int getleft() {
		return left;
	}

	public int getright() {
		return right;
	}

	public int getmid() {
		return mid;
	}

	public int getover() {
		return over;
	}

}
