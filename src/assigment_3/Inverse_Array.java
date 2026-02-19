package assigment_3;

import java.util.Scanner;

public class Inverse_Array {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }

	        int[] arr2 = new int[n];
	        for(int i=0; i<n; i++){
	            // if(arr[i]<n){

	            // }
	            arr2[arr[i]] = i;
	        }

	        for(int elm : arr2){
	            System.out.print(elm+" ");
	        }
	        System.out.println();
	        System.out.println("=============================");
	        
	     // with in the same array 
	      //Encode inverse inside same array
	        for(int i=0; i<n; i++) {
	        	arr[arr[i]%n] += i*n;
	        }
	        //Step 2: Extract inverse
	        for(int i=0; i<n; i++) {
	        	arr[i] = arr[i]/n;
	        }
	        
	        for(int elm: arr) {
	        	System.out.print(elm +" " );
	        }
	}
} 

