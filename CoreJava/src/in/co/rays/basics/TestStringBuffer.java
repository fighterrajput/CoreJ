package in.co.rays.basics;

public class TestStringBuffer {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("Ankit");
	System.out.println(s.length());
	//System.out.println(s.reverse());
	System.out.println(s.charAt(4));
	System.out.println(s.replace(0, 2, "Raj"));
	System.out.println(args[2]);
}
}
