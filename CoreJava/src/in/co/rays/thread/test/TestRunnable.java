package in.co.rays.thread.test;

public class TestRunnable {
	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunnable("Ankit"));
		Thread t2 = new Thread(new ByRunnable("Dharm"));

		t1.start();
		t2.start();
	}

}
