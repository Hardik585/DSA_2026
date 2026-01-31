package lec_4;

public class Reverse_No {
   public static void main(String[] args) {
	int n =2346;
	int no =0;
	
	while(n>0) {
		int rem = n%10;
		no*=10;
		no += rem;
		n/=10;
	}
	System.out.println(no);
}
}
