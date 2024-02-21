package in.co.rays.thread.test;

public class TestWithThread {
	public static void main(String[] args) {

		WithThread t1 = new WithThread("Ankit");
		WithThread t2 = new WithThread("Dharm");

		t1.start();
		t2.start();
	}

}
