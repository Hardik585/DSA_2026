package lec_13;

public class Check_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
         System.out.println(check(str));
	}
	
	public static boolean check(String str) {
		int i=0;
		int j = str.length()-1;
		while(i<j) {
			 if(str.charAt(i) != str.charAt(j)) {
				 return false;
			 }
			i++;j--;
		}
		return true;
	}
}
