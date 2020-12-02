package er;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Binerstest {
	add zn;
	substract sub;
	exercises ex;
	@BeforeEach
	void setUp(){
		zn = new add();
		sub = new substract();
		ex=new exercises();
	}

	@Test
	void test1() {
		int[] bean=new int[]{5,8,0,13};
		int [] a =zn.calculate(5, 8);
		
		assertTrue(bean[0]==a[0]&&bean[1]==a[1]&&bean[2]==a[2]&&bean[3]==a[3]);
	}
	
	@Test
	void test2() {
		int[] bean=new int[]{5,8,0,13};
		int [] a =sub.calculate(5, 8);
		
		assertTrue(bean[0]==a[0]&&bean[1]==a[1]&&bean[2]==a[2]&&bean[3]==a[3]);
	}

	@Test
	void test3() {
		int[] bean=new int[]{13,8,1,5};
		int [] a =sub.calculate(13,8);
		
		assertTrue(bean[0]==a[0]&&bean[1]==a[1]&&bean[2]==a[2]&&bean[3]==a[3]);
	}

	@Test
	void test4() {
		Biners Bin=ex.generoperation();
		add ia = new add();substract au = new substract();
		assertTrue(Bin==ia || Bin==au );
		
	}

}
