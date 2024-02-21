package in.co.rays.io.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestEmails {
	public static void main(String[] args) throws IOException {

		FileReader read = new FileReader("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Emails.txt");

		BufferedReader in = new BufferedReader(read);

		FileWriter write = new FileWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\CorrectEmails.txt");

		PrintWriter out = new PrintWriter(write);

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = in.readLine();

		while (line != null) {
			if (line.matches(emailreg)) {
				out.println(line);
			}
			line = in.readLine();
		}
		out.close();
		in.close();
		System.out.println("done");

	}

}
