package in.co.rays.OOP;

public class TestShape1 {

	public static void main(String[] args) {
		Shape1 s1 = new Shape1("red" , 20);
		System.out.println(s1.borderwidth());
		System.out.println(s1.color());
		
		RecShape1 r = new RecShape1(20, 20);
		r.area();
	}
}


