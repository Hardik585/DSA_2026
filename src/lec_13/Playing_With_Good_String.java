package lec_13;

public class Playing_With_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printGoodStr(String str) {
		  int ans = 0 , sum =0;
			for(int i=0; i<str.length(); i++){
	          char ch = str.charAt(i);
			  if(ch == 'a' || ch =='e' || ch=='i' || ch =='o' || ch =='u'){
				  sum++;	   
			  }else{
				  sum =0;
			  }
			   ans = Math.max(ans, sum);
			}
			System.out.println(ans);
	}

}
