package Assignment28;

public class fourth {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		int count = 1;
		int n = 6;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		System.out.println("Count=" + count);

	}

}
