package in.co.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testtest {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String s = sdf.format(d);
		System.out.println(s);
		
	}
	}

