package lec_15;

public class Print_INC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              printDec(8);
	}
	
	public static void printDec(int n ) {
		if(n==0) {
			return ;
		}
		printDec(n-1);
		System.out.println(n);
	}

}
