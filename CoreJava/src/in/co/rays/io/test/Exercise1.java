package in.co.rays.io.test;

import java.io.File;

public class Exercise1 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)");
		String[] filelist = file.list();
		for (String name : filelist) {
			System.out.println(name);
			//Java program to get a list of all file/directory names in the given directory.
		}
	}

}
