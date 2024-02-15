package in.co.rays.exercise;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
	 Random random= new Random();
	 
	 for (int i = 1; i<=5; i++) {
		
	
	 System.out.println(random.nextInt(100));
	 }
	}

}
