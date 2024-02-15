package in.co.rays.basics;

public class TestMaxInArray {
public static void main(String[] args) {
	int[]a= {2,5,9,12,35};
	int b=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>b) {
			b=a[i];
			 
		}
	}
	System.out.println(b);	
	}
}
