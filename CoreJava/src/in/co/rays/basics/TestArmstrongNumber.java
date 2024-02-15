package in.co.rays.basics;

public class TestArmstrongNumber {
	public static void main(String[]args) {
		int number=153;
			int n= number;
		int sum=0;
		int r;
		 while(n>0) {
		 r=n%10;
		 sum= sum+(r*r*r);
		 n=n/10;
		 }
		 if(sum==number) {
			 System.out.println("Yes");
			 
		 }
		 else {
			 System.out.println("No");
		 }
		 
	}
}
	
