package in.co.rays.basics;

public class TestAdditionSwitchCase {
public static void main(String[] args) {
	int add = 3;
	int a = 10;
	int b = 20;
	switch(add) {
	
	case 1:
		int c = a*b;
		System.out.println("Mul="+c);
		break;
	case 2:
		int d = a/b;
		System.out.println("Div="+d);
		break;
	case 3:
		int e = a+b;
		System.out.println("Add="+e);
		break;
	case 4:
		int f = a-b;
		System.out.println("Sub="+f);
		break;
	default:
	System.out.println("Sorry Not Found");
	}
}
}
