package in.co.rays.thread.join;

public class JoinThread extends Thread {
	String name = null;

	public JoinThread(String name) {
		this.name = name;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + name);

		}
	}

}
