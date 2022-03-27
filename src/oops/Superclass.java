package oops;

public class Superclass 
  
{
	 int k=8;
  public static  void family() 
  {
	
	Superclass z=new Superclass();
	int a=z.k;
	int j=6+a;
	System.out.println("amol 86" +" "+ j);		
	 
	
	  
  }
   public void family1() {
	 
	   System.out.println(" amol 85 ");
	   
   }
    public static void main(String[] args) {
		  Superclass obj= new Superclass();
		  
		  obj.family1();
		  
		  Superclass.family();
    	System.out.println();
	}
}
