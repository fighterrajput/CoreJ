package in.co.rays.io.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise5 {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\CorrectEmails.txt");

		PrintWriter out = new PrintWriter(file);
		out.print("ankitsinghtushar@gmail.com");
		out.print("     ");
		out.print("ankitsinghdadara@gmail.com");

		out.close();
		file.close();

	}

}
