package lec_12;

public class Find_the_Minimum_Area_to_Cover_All_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1,0} , {1, 0, 1}};
      
		System.out.println(Minimum_Area(arr));
	}
	
	public static int Minimum_Area(int[][] arr) {
		int minR = Integer.MAX_VALUE;
		int minC = Integer.MAX_VALUE;
		
		int maxR = Integer.MIN_VALUE;
		int maxC = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == 1) {
					maxR = Math.max(maxC, i);
					maxC = Math.max(maxC, j);
					minR = Math.min(minR, i);
					minC = Math.min(minC, j);
				}
			}
		}
		
		return (maxR - minR +1 ) * (maxC - minC +1);
	}

}
