package in.co.rays.thread.join;

public class TestThreadJoin {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("Ankit");
		JoinThread t2 = new JoinThread("dharm");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
