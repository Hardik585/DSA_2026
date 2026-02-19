package lec_13;

public class String_To_Number {
	public static void main(String[] args) {
         System.out.println(convert("1214"));
         
         int n = Integer.parseInt("Hello");
         long l = Long.parseLong("Hdee");
	}
	public static int convert(String str) {
		// '0' + '0' = 0
		//'1'  + '0' = 1
		// '2' + '0' = 2
		int sum = 0;
		int base = 10;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			sum  = sum * base +  (ch - '0');
		}
		return sum;
	}
}
