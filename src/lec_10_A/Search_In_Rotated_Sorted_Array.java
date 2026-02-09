package lec_10_A;

public class Search_In_Rotated_Sorted_Array {
	public static void main(String[] args) {

	}

	public static int Search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if(arr[mid] >= arr[low]) { //mera mid uppar line pe hai
				if(arr[low] <= target && arr[mid] > target) {
					high = mid-1;
				}else {
					low = mid +1;
				} 
			}else { //mera mid lower line pe hai 
				 if(arr[mid]< target && arr[high]>= target) {
					 low =mid+1;
				 }else {
					 high =mid-1;
				 }
			}
		}
		return -1;
	}
}
