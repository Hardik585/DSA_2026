package lec_15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a =2, x =4;
          System.out.println(pow(a, x));
	}
	
	
	public static int pow(int a , int x) {
		//base case 
		if(x==0) {       
			return 1; 
		}
		
		int res = pow(a , x-1);
		return res * a;
	}

}
