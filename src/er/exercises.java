package er;

import java.util.ArrayList;
import java.util.Random;

public  class exercises {

	ArrayList<Biners> sitelist = new ArrayList<Biners>();

	public  void  generate(int maxsu,int r) {
		Biners anoper ;	
		for(int i=0;i<maxsu;i++)
		{
		  do {
			  if(r==1)
				  anoper=addoperation();
			  else if(r==2)
				  anoper=substractoperation();
			  else
			  anoper=generoperation();
			}while(sitelist.contains(anoper));
			sitelist.add(anoper);
		}
		}
	public  Biners generoperation() {
		Random c = new Random();
		int n=c.nextInt(2);
	       if(n==0)
	    	return  new add();
		   else 
			return new substract();
	}
	public Biners addoperation() {
		return new add();
	}
	public Biners substractoperation() {
		return new substract();
	}
}
