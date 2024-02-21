package in.co.rays.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinary {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Udaipur.jpg");

		FileOutputStream out = new FileOutputStream("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Ankit.jgp");

		int ch = in.read();
		while (ch != -1) {

			out.write(ch);
			ch = in.read();

		}
		out.close();
		in.close();
	}

}
