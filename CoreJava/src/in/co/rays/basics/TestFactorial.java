package in.co.rays.basics;

public class TestFactorial {
public static void main(String[] args) {
	int i=1;
	int s=1;
	while(i<=8) {
		s=i*s;
		i++;
	}
	System.out.println(s);
}
}
