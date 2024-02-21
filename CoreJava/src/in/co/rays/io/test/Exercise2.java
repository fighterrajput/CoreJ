package in.co.rays.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise2 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Obj.txt");

		if (f.exists()) {
			System.out.println("size=" + f.length() + "byte");
		} else {
			System.out.println("file not found");
		}

	}

}
