package lec_13;

public class SubString {

	public static void main(String[] args) {
		String str = "Hardik Kaushik";
		//library 
		System.out.println(str.substring(2, 6));
		
		printAllSubString("Hello");
		
	}
	
	public static void printAllSubString(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				System.out.print(str.substring(i,j)+" ");
			}
			System.out.println();
		}
	}

}
