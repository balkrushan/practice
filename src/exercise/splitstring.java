package exercise;

public class splitstring {
	public static void main(String[] args) {
		
	String m="All is well";
	String idx[] =m.split(" ");
	int q=idx.length;
	for(int i=q-1; i>=0; i--) {
		System.out.print(idx[i]+" ");
		
		
		String b ="All is OK and";
		     String[] a=    b.split(" ");
		    int z    = a.length; 
		    System.out.println(z);
		    for(int i1=z-1; i1>=0; i1--)
		    {
		    	System.out.print(a[i1]+" ");
		    }
		    String n=b.replaceAll("\\s","");
		    
		    System.out.println(n);
	}
	
	
}

}
