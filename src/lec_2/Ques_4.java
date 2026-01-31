package lec_2;

public class Ques_4 {
	public static void main(String[] args) {
		int n=5;
          for(int i=1; i<=n; i++) {
        	  
        	  for(int j=0;j<n-i; j++) {
        		  System.out.print(" \s");
        	  }
        	  
        	  for(int j=0; j<i; j++) {
        		  System.out.print("*\s");
        	  }
        	  System.out.println();
          }
	}
}
