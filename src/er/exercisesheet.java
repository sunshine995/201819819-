package er;

import java.util.ArrayList;
import java.util.Scanner;

public class exercisesheet {
	
  private static int line=5;
  private static int  shumax=50;
  
	public static void main(String[] args) {
		exercises exe = new exercises();
        System.out.println("请选择选择输入加法（1）、减法（2）或者混合练习，（3）");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("请选择是否改变练习的题目的数量（默认为50道）1、改变，");
        int x=in.nextInt();
        if(x==1) {
        	System.out.println("请选择想要练习题目数量");
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
	    			System.out.printf("第%02d题:%02d + %02d   ",(i+1),s.getleft(),s.getright());
	    			else
	    				System.out.printf("第%02d题:%02d - %02d   ",(i+1),s.getleft(),s.getright());
	    		i++;
	    	}
	    	System.out.println("\n--------------------");
			System.out.println("\n--------------------");
			System.out.println("----以下是答案----");
			System.out.println("--------------------\n");
			int j=0;
			for(Biners s:sitelist2)
			{
				if((j+1)%5==1)
					System.out.printf("\n 第%02d到%02d题答案：",(j+1),(j+5));
				System.out.printf("%02d ",s.getover());
				j++;
			}

	}

}
