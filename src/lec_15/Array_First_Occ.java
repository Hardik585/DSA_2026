package lec_15;

public class Array_First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 4, 5 };
		int item = 40;
		 int res = first_Occ(arr, item, 0);
		 System.out.println(res);
	}

	public static int first_Occ(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return first_Occ(arr, item, ++idx);
	}

}
