package in.co.rays.exercise;

public class TestReverseDigit {
 public static void main(String[] args) {
	
	 int n = 12345;
	 
	 int sum = 0;
	 
	 int reminder = 0;
	 
	 while(n>0) {
		 reminder = n%10;
		 sum = sum*10+ reminder;
		 n = n/10;
	 }
	 System.out.println(sum);
		 
		 
	 }
}
	
	


