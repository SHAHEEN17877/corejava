
public class SecondSmollestExp {
	static int getSecondSmallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}

		return arr[1];
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 64, 59, 90, 68, 87 };
		System.out.println(getSecondSmallest(arr));
	}
}
