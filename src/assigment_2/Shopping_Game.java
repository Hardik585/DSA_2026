package assigment_2;

import java.util.Scanner;

public class Shopping_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		while (testCase > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			int a =0 , h=0;
			int totalA =0 , totalH=0;
			while(totalA<=M && totalH<=N) {
				
				a = ++h; 
				if(totalA+a <=M) {
					totalA+=a;
				}else {
					break;
				}
				h = a+1;
				if(totalH+h <=N) {
					totalH+=h;
				}else {
					break;
				}
				System.out.println("Val of a : "+ a + "\t val of h : " + h );	
			}
			if(totalA > totalH) {
				System.out.println("Aayush");
			}else {
				System.out.println("Harshit");
			}
			
			testCase--;
		}

	}
}

/*
 * int m = sc.nextInt(); int n = sc.nextInt(); int totalA = 0, totalH = 0; while
 * (a <= m && h <= n) { a = h + 1; h = a + 1; System.out.println("val of A : "+
 * a +"\n val of H : "+ h); if (totalA + a <= m) { totalA += a; } if(totalH + h
 * <= n) { totalH += h; } } //System.out.println(totalA);
 * //System.out.println(totalH); if (totalA < totalH) {
 * System.out.println("harshit"); } else { System.out.println("Aayush"); }
 * testCase--;
 */