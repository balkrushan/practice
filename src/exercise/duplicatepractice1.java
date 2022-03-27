package exercise;

public class duplicatepractice1 {
 public static void FindduplicateNo(String a) {
	
	         int b  =a.length()-1;
	         for(int i=0; i<=b; i++) {
	        	 for(int j=i+1 ;j<=b;j++) {
	        		 if(a.charAt(i)==a.charAt(j)) {
	        			 System.out.println("Duplicate No:"+ a.charAt(i));
	        		 }
	        		 
	        	 }
	         }
	 System.out.println(b);
	
	 
 }
 public static void main(String[] args) {
	 duplicatepractice1.FindduplicateNo("balkrushannjhjhjhklk");
	 
}
}
