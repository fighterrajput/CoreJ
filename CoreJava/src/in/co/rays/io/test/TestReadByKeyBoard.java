package in.co.rays.io.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyBoard {
	public static void main(String[] args) throws IOException {

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);

		PrintWriter out = new PrintWriter("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Keyboard.txt");
		String line = in.readLine();
		while (!(line.equals("bye"))) {

			out.println(line);

			line = in.readLine();
		}
		out.close();
		in.close();

	}

}
