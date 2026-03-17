package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(countWord(str, 0 , 0));
	}

	public static int countWord(String str, int ind, int count) {
		if (ind == str.length()) {
			return count;
		}
		if (str.charAt(ind) == ' ') {
			count +=1 ;
		}
	    return countWord(str, ind + 1, count);
		
	}

}
