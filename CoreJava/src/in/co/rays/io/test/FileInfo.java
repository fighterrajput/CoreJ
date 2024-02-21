package in.co.rays.io.test;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Emails.txt");

		if (f.exists()) {
			System.out.println("File Name = " + f.getName());
			System.out.println("Path = " + f.getAbsolutePath());
			System.out.println("Access Permission");

			System.out.println("Writable" + f.canWrite());
			System.out.println("Readable=" + f.canRead());

			System.out.println("Is file =" + f.isFile());
			System.out.println("Is directory=" + f.isDirectory());

			Date d = new Date(f.lastModified());
			System.out.println("Data Modified=" + d);

			long length = f.length();
			System.out.println("Length:" + length + "bytes");

		} else {
			System.out.println("File not fount");
		}
	}

}
