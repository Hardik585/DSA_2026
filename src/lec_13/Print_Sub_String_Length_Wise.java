package lec_13;

public class Print_Sub_String_Length_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "HardikKauhsik";
          print(str);
	}

	public static void print(String str) {
		for (int len = 1; len <= str.length(); len++) {
             for(int j=len; j<=str.length();j++) {
//            	 int i = j -len;
            	   System.out.println(str.substring(j-len , j));
             }
		}
	}

}
