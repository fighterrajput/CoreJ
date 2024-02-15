package in.co.rays.customexception;

public class TestLogin {
	public static void main(String[] args) {
		
		String login = "admi";
		
		System.out.println("**before**");
		
		try {
			if (login.equals("admin")) {
				System.out.println("valid user id...!!!");
				
				
			}else {
				LoginException e = new LoginException();
				throw e;
			}}catch (CheckedException e) {
			System.out.println(e);
		}
		System.out.println("**after**");
			
		}
	
		
	}



