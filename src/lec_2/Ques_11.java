package lec_2;

public class Ques_11 {
	public static void main(String[] args) {
         int n =5; 
         for(int i=1; i<=n; i++) {
//        	 for(int j=i; j<n; j++) {
//        		 System.out.print(" \s");
//        	 }
        	 for(int j=1; j<=n; j++) {
        		 if(i+j==n+1 || i+j==n+3 || (i+j)/2 ==n) {
        			 System.out.print("*\s");
        		 }else {
        			 System.out.print(" \s");
        		 }
        	 }
        	 
        	 for(int j=1; j<i; j++ ) {
        		 if(i==j) {
        			 System.out.print("*\s");
        		 }else {
        			 System.out.print(" \s");
        		 }
        	 }
        	 System.out.println();
         }
	}
}
