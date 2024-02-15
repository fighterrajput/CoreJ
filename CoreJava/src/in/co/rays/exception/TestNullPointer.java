package in.co.rays.exception;

public class TestNullPointer {
	public static void main(String[] args) {
		try {
			String name = null;
			
			System.out.println(name.length());
		} catch (CheckedException e ) {
			System.out.println("e="+e);
			System.out.println("Message="+e.getMessage());
			e.printStackTrace();
		}
	}

}
