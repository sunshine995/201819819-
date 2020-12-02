package wushier;

import java.util.Random;

public class Binaryoperation {
	static int maxshu=100;
	static int maxsu=50;
	static int []bean = new int[4];
	private int left=0,over=0;
	private int right=0,mid=0;
	
	public static int mid() {
		Random c = new Random();
		int n=c.nextInt(2);
		return n;
	}
	public static int random(){
		Random c = new Random();
		int n=c.nextInt(maxshu+1);
		return n;
	}
	public static int [] addition() {
		int a[] =new int[4];
		int lefts =random();
		 int rights = random();
		int over = lefts+rights;
		while(over>100) {
			 lefts =random();
			 rights = random();
			 over = lefts+rights;
		}
		a[0]=lefts;a[1]=rights;a[2]=0;a[3]=over;	
		return a;
	}
	public static int [] subtraction() {
		int a[] =new int[4];
		int left =random();
		int right = random();
		if(left>right) {
			int over = left-right;
			a[0]=left;a[1]=right;a[2]=1;a[3]=over;			
			return a;
		}
		else
		   {
				int over = right-left;
				a[0]=right;a[1]=left;a[2]=1;a[3]=over;			
				return a;
			}
		
	}
	public  static Binaryoperation  generate() {			
				int r=mid();
				if(r==0) {            //1表示加法					
					bean=addition();				 
				}		
				else                 //0表示减法
				 {  
					bean=subtraction();				 
				}
				Binaryoperation in = new Binaryoperation();
				in.construct(bean[0],bean[1],bean[2],bean[3]);
				return in;
		}
	public void construct(int lefts,int rights,int mids,int overs) {
		left = lefts;
		right = rights;
		mid = mids;
		over=overs;
	}
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
	public boolean equals(Binaryoperation operlist) {
		return left==operlist.getleft() && right==operlist.getright() && mid==operlist.getmid();		
	}
}
