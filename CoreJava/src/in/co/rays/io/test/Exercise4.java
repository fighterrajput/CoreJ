package in.co.rays.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise4 {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Ankit.txt", true);
		file.write(" I will be a Java Architect");
		file.write("The day will come soon");

		file.close();
	}

}
