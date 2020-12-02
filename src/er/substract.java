package er;

public class substract extends Biners {
	public substract() {
		generate(1);
	}
	public boolean check(int overs) {
		return overs>=0;
	}
	public int[] calculate(int left,int right) {
		int beans[] = new int[4];
		int over;
		over=left-right;
		beans[0]=left;beans[1]=right;beans[2]=1;beans[3]=over;
		return beans;
	}

}
