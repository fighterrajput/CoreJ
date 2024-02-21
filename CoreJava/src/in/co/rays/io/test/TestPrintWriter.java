package in.co.rays.io.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Ankit.txt");

		PrintWriter out = new PrintWriter(file);

		out.print("Ankit");
		out.print(" ");
		out.print("Rajput");

		out.close();
		file.close();
	}

}
