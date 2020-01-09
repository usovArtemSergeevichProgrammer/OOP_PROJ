package tester;

public class Utils {
	public static void printArray(int arr[], boolean inLine) {

		for (int i = 0; i < arr.length; i++) {
			if (!inLine) {
				System.out.println("arr [" + i + "] = " + arr[i]);
			} else {
				if (i == 0) {
					System.out.print("arr [] = {" + arr[i] + ", ");
				} else if (i == arr.length - 1) {
					System.out.print(arr[i] + "}\n");
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		}

	}

	public static int[] generateAndPopulateArray(int size, int bound) {

		int arr[] = new int[size]; // {0,0,0}
		for (int i = 0; i < size; i++) {
			boolean isPositive = ((int) (Math.random() * 2) == 1);
			arr[i] = (int) (Math.random() * bound + 1) * (isPositive ? 1 : -1);
		}
		return arr;
	}

	public static int FindMax(int arr[]) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int Univers(int arr[], boolean isMax) {

		int val = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (isMax ? val < arr[i] : val > arr[i]) {
				val = arr[i];
			}
		}
		return val;
	}

}
