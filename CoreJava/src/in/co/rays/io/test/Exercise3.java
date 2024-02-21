package in.co.rays.io.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Obj.txt");
		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();

		while (line != null) {
			System.out.println(line);

			line = in.readLine();
		}
		in.close();
		file.close();
	}

}
