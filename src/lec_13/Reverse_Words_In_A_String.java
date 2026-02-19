package lec_13;

import java.util.Arrays;

public class Reverse_Words_In_A_String {
	public static void main(String[] args) {
		String str = "  the sky    is blue ";
		System.out.println(str);

		String str2 = str.trim();
		System.out.println(str2);

		String[] arr = str.split(" +"); // "t" , "t+", "k+"; | split into array acc to the given char
		System.out.println(Arrays.toString(arr));

		String ans = "";
		for (int i = arr.length-1; i >=0; i--) {
            ans +=arr[i]+" ";
		}
		
		System.out.println(ans);
		System.out.println(ans.trim());
		
	}
}
