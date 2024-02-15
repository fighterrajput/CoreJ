package in.co.rays.exception;

public class TestArithmaticException {
	public static void main(String[] args) {
		
		try{
			int a = 15;
			
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
		}catch(CheckedException e) {
			System.out.println(e);
		}
			
	}
	
	
	

}
