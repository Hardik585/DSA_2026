package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(lenOfString(str));
	}

	public static int lenOfString(String str) {
          if(str.length() ==0) {
        	  return 0;
          }
          int sum = lenOfString(str.substring(1));
          return sum + 1;
	}

}
