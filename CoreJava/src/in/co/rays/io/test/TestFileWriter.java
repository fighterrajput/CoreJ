package in.co.rays.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\My.txt", true);
		file.write("I am A Java Architect");

		file.close();
	}	

}
