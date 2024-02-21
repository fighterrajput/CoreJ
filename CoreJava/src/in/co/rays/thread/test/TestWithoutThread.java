package in.co.rays.thread.test;

public class TestWithoutThread {
	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("Ankit");
		WithoutThread t2 = new WithoutThread("Dharm");

		t1.run();
		t2.run();
	}

}
