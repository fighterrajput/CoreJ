package in.co.rays.thread.priority;

public class TestPriority {
	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Ankit");
		PriorityThread t2 = new PriorityThread("Dharm");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();
	}

}
