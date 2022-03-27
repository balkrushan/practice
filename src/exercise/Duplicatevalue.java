package exercise;

public class Duplicatevalue {

	public static void main(String[] args) 
	{
//		int a[]= {100,11,22,25,23,11,22};
//		 String a[]= {"b","k","l","k","r","u","s","h","a","n"};
//		for(int i =0; i<=a.length-1;i++)
//		{
//			for(int j=i+1; j<=a.length-1; j++) {
//				if (a[i]==a[j])
//				{
//					System.out.println("duplicateno="+" " +a[i]);
//				}
//				
//				}
//			}
//		
//		String a = ("balkrushab");
//		    int b=a.length()-1;
//		    for (int i =0;  i<=b; i++ ) 
//		    {
//		    	for(int j=i+1; j<=b; j++) 
//		    	{
//		    	    if (a.charAt(i)==a.charAt(j))	{
//		    	    	System.out.print("duplicate no=" + a.charAt(i)+" ");
//		    	    }
//		    	}
//		    }
		
//		String a ="Great responsibility";
//		  int b=a.length();
//		  for(int i=0; i<=b-1; i++) 
//		  {
//			for(int j=i+1; j<=b-1; j++) {
//				if(a.charAt(i)==a.charAt(j)) {
//					System.out.print(" "+"duplicate no"+ " "+"="+a.charAt(i));
//				}
//				
//					
//			}
//		  }
		
		String a="Great responsibility";
		    int b=a.length()-1;
		    for(int i=0; i<=b;i++) {
		    	for(int j=i+1; j<=b ;j++) {
		    		if(a.charAt(i)==a.charAt(j)) {
		    			System.out.print(" "+a.charAt(i));
		    		}
		    	}
		    }
		}
		

	}

//duplicate no11
//duplicate no22
