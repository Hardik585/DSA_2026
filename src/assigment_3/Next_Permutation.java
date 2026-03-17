package assigment_3;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		permutation(arr);
		print(arr);
	}

	public static void permutation(int[] arr) {
		int n = arr.length;
		int p = -1, q = -1;
		// p
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			revArr(arr, 0, n - 1);
			return;
		}
		// q
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// swap
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

		// p+1 to n-1 reverse krn hai
		revArr(arr, p + 1, n - 1);
	}

	public static void revArr(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
