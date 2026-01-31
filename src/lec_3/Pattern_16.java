package lec_3;

public class Pattern_16 {
	public static void main(String[] args) {
       int n=5;
       int row =1;
       int star =5;
       int space = n-1;
       
       while(row <=2*n-1) {
    	   //space
    	   int i=1;
    	   while(i<=space) {
    		   System.out.print("\s\s");
    		   i++;
    	   }
    	   //star
    	   int j=1;
    	   while(j<=star) {
    		   System.out.print("*\s");
    		   j++;
    	   }
    	   
    	   if(row <n) {
    		   space--;
    		   star--;
    	   }else {
    		   space++;
    		   star++;
    	   }
    	   row++;
    	   System.out.println();
       }
	}
}
