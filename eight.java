package Assignment28;

public class eight {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int even = 0, odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Total number of even number is " + even);
		System.out.println("Total number of odd number is " + odd);
	}

}

