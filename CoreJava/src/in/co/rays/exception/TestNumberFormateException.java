package in.co.rays.exception;

public class TestNumberFormateException {
	
	public static void main(String[] args) {
		
		try {
			String str = "1e7";
			
			int number = Integer.parseInt(str);
			
			System.out.println(number);
		}catch (CheckedException e) {
			System.out.println(e);
		}
	}

}
