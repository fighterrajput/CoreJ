package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParseMethod {
public static void main(String[] args) throws ParseException {
	//Date d= new Date()
	String s= "17/10/2027";
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	
	Date d= sdf.parse(s);
			System.out.println(d);
}
}
