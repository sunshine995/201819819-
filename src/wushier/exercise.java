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
			if (angerenate.equals(operlist[i])) {  //����
//				System.out.println("\n��ʽ��֮ǰ�ظ�");     �������
				found = true;
				break;
			}
			
		}
		return found;
	}
	//������ʽ�ıȽ�
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
			System.out.printf("��%02d��:%02d + %02d   ",(i+1),operlist[i].getleft(),operlist[i].getright());
			else
				System.out.printf("��%02d��:%02d - %02d   ",(i+1),operlist[i].getleft(),operlist[i].getright());
		}
		System.out.println("\n--------------------");
		System.out.println("\n--------------------");
		System.out.println("----�����Ǵ�----");
		System.out.println("--------------------\n");
		for(int i=0;i<maxsu;i++) {	
			if((i+1)%5==1)
				System.out.printf("\n ��%02d��%02d��𰸣�",(i+1),(i+5));
			System.out.printf("%02d ",operlist[i].getover());
		}
	}

}
