package lec_15;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n =5;
          System.out.println(fact(n));
	}
	
	public static int fact(int n) {
		//Base Case
		if(n ==0) {
			return 1;
		}

		int f = fact(n-1);
		return f*n;
	}

}
