package er;

import java.util.ArrayList;
import java.util.Scanner;

public class exercisesheet {
	
  private static int line=5;
  private static int  shumax=50;
  
	public static void main(String[] args) {
		exercises exe = new exercises();
        System.out.println("��ѡ��ѡ������ӷ���1����������2�����߻����ϰ����3��");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("��ѡ���Ƿ�ı���ϰ����Ŀ��������Ĭ��Ϊ50����1���ı䣬");
        int x=in.nextInt();
        if(x==1) {
        	System.out.println("��ѡ����Ҫ��ϰ��Ŀ����");
        	shumax=in.nextInt();
        }
		exe.generate(shumax,n);
		prints(exe);
	}
	
	 public static void prints(exercises exe) {
		 ArrayList<Biners> sitelist2=exe.sitelist;
	    	int i=0;
	    	for(Biners s : sitelist2) {	
	    		if((i+1)%5==1)
					System.out.printf("\n ");
	    		
	    		if(s.getmid()==0)
	    			System.out.printf("��%02d��:%02d + %02d   ",(i+1),s.getleft(),s.getright());
	    			else
	    				System.out.printf("��%02d��:%02d - %02d   ",(i+1),s.getleft(),s.getright());
	    		i++;
	    	}
	    	System.out.println("\n--------------------");
			System.out.println("\n--------------------");
			System.out.println("----�����Ǵ�----");
			System.out.println("--------------------\n");
			int j=0;
			for(Biners s:sitelist2)
			{
				if((j+1)%5==1)
					System.out.printf("\n ��%02d��%02d��𰸣�",(j+1),(j+5));
				System.out.printf("%02d ",s.getover());
				j++;
			}

	}

}
