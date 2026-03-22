package lec_20;

public class Partition_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };

		System.out.println(Partition(arr, 0, arr.length-1));
		
		for(int elm : arr) {
			System.out.print(elm+" ");
		}
	}

	public static int Partition(int[] arr, int si, int ei) {

		int item = arr[ei];
		int idx = si;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}

		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

}
