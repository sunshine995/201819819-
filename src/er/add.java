package er;

public class add extends Biners {
	public add() {
		generate(0);
	}
	public boolean check(int overs) {
		return overs<=100;
	}
	
	 public int[] calculate(int left,int right) {
		 int beans[] = new int[4];
		 int over; 
		 over=left+right;
		 beans[0]=left;beans[1]=right;beans[2]=0;beans[3]=over;
	 return beans; }
	 

}
