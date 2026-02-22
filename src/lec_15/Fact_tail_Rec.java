package lec_15;

public class Fact_tail_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          fact(1 , 5);
	}
	
	
	public static void fact(int res , int n ) {
		if(n==1) {
			System.out.println(res);
			return ;
		}
		res *= n;
		fact(res ,n-1);
	}

}
