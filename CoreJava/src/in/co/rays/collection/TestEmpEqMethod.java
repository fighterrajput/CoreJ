
package in.co.rays.collection;

public class TestEmpEqMethod {
	public static void main(String[] args) {
		String s1 = "abc";
		String s3 = s1;
		
		System.out.println(s1==s3);
		
		
		String s2 = new String("abc");
		
		System.out.println(s1.equals(s2));
		
		
		
	}

}
