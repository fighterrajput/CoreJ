package in.co.rays.exceptionobligation;

public class TestUnchecked {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		mom();
	}
	public static void mom() {
		try {
			son();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void son() {
		UncheckedException u = new UncheckedException();
		throw u;

}}
