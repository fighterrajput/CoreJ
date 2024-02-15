package in.co.rays.OOPS;

import java.text.ParseException;

public class TestLogics {
	public static void main(String[] args) throws ParseException {
		Logics l = new Logics();

		l.palindrome(132);
		l.date("30/01/2024");
		int[] a = { 20, 30, 40, 5, 10 };
		int t = l.secMax(a);
		System.out.println(t);

		int[] b = { 20, 30, 50, 4, 3 };
		l.bubbleSort(b);

		// l.dateFormat(s);

	}

}