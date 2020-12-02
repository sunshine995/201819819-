package wushier;

public class exercise {
	static int maxsu=50;
	private static Binaryoperation operlist[] = new Binaryoperation[maxsu];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate();
	}
	public static boolean  contains(Binaryoperation angerenate,int l) {
		boolean found=false;
		for(int i=0;i<l;i++) {
			if (angerenate.equals(operlist[i])) {  //调用
//				System.out.println("\n算式与之前重复");     测试语句
				found = true;
				break;
			}
			
		}
		return found;
	}
	//两个算式的比较
	public static void  generate() {
		Binaryoperation angenerate,en= new Binaryoperation();
			for(int i=0;i<maxsu;i++) {
				do {
						angenerate=en.generate();
				}while(contains(angenerate,i-1));
						operlist[i]=angenerate;
					 
				}		
//				System.out.printf("\n");
			
			prints(operlist);
		}
	public static void prints(Binaryoperation[] operlist) {
		for(int i=0;i<maxsu;i++) {
			if((i+1)%5==1)
				System.out.printf("\n ");
			if(operlist[i].getmid()==0)
			System.out.printf("第%02d题:%02d + %02d   ",(i+1),operlist[i].getleft(),operlist[i].getright());
			else
				System.out.printf("第%02d题:%02d - %02d   ",(i+1),operlist[i].getleft(),operlist[i].getright());
		}
		System.out.println("\n--------------------");
		System.out.println("\n--------------------");
		System.out.println("----以下是答案----");
		System.out.println("--------------------\n");
		for(int i=0;i<maxsu;i++) {	
			if((i+1)%5==1)
				System.out.printf("\n 第%02d到%02d题答案：",(i+1),(i+5));
			System.out.printf("%02d ",operlist[i].getover());
		}
	}

}
