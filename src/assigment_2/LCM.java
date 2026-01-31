	package assigment_2;
	
	import java.util.Scanner;
	
	public class LCM {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int x = n1*n2;
			int lcm =1;
			while(x>1) {
				if(x%n1==0 && x%n2==0) {
					lcm = x;
				}
				x--;
			}
		System.out.println(lcm);
		}
	}
