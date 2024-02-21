package in.co.rays.io.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\My.txt");

		int ch = file.read();

		while (ch != -1) {
			System.out.print((char) ch);

			ch = file.read();

		}
		file.close();
	}

}
