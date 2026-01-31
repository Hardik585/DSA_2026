package lec_2;

public class Ques_9 {
   public static void main(String[] args) {
	   int n =5;
	   for(int i=1; i<=n ; i++) {
		   for(int j=i; j<n ; j++) {
			   System.out.print(" \s");
		   }
		   for(int j=0; j<i; j++) {
			   System.out.print("*\s");
		   }
		   for(int j=1; j<i; j++) {
			   System.out.print("*\s");
		   }
		   System.out.println();
	   }
}
}
