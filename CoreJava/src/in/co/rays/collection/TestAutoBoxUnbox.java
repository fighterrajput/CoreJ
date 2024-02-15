package in.co.rays.collection;

public class TestAutoBoxUnbox {
	public static void main(String[] args) {
		int a = 10;
		
		Integer b = a; //auto boxing
		
		int c = b; //auto unboxing
		
		System.out.println(a);
	}

}
