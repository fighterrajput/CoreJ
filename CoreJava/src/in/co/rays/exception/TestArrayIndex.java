package in.co.rays.exception;

public class TestArrayIndex {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3, 4, 5 };

			System.out.println(arr[10]);
		} catch (CheckedException e) {
			System.out.println(e);
		}

	}

}
