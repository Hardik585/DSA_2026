package assigment_3;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n; i++){
            arr[i] = sc.next();
        }

        
        for(int i=0; i<n; i++){
            String str = arr[i];
            int sum =0 , base = 1;
            for(int j=str.length()-1; j>=0; j--) {
            	int no =str.charAt(j) - '0';
            	sum += no * base;
            	base *=2;
            }
           System.out.println(sum); 
        }     
       	
    }

}
