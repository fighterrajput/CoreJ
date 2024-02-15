package in.co.rays.basics;

public class TestPalindromeNumber {
public static void main(String[] args) {
	int a= 140;
	int b= a;
	int c= 0;
	int d;
	
	while (b>0) {
		d=b%10;
		c=c*10+d;
		b=b/10;
		
		
	}
	if (c==a) {
		System.out.println("Yes its a Palindrome number");
	}
	else {
		System.out.println("its not a Palindrome number");
	}
}
}
