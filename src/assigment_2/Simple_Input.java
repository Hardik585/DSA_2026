package assigment_2;

import java.util.Scanner;

public class Simple_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int ans =0;
		while(true) {
			int val = sc.nextInt();
			if(ans+val > 0) {
				System.out.println(val);
				ans+=val;
			}else {
				break;
			}
		}    
	}
}

/*
 * Scanner sc = new Scanner(System.in); int ans =0; while(true) { int rem =
 * sc.nextInt(); ans +=rem; if(ans !=0 ) { System.out.println(rem); }else {
 * return; } }
 */