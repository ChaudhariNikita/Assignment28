package Assignment28;

public class first {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int max = a[0];
		int sum = 0;
		double avg = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i : a) {
			sum += i;
			avg = sum / a.length;
		}

		System.out.println("Maximum number is " + max);
		System.out.println("Average is " + avg);
	}

}
