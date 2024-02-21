package in.co.rays.io.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\My.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		sc.close();
		file.close();
	}

}
