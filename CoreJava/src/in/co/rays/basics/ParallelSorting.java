package in.co.rays.basics;

import java.util.Arrays;

public class ParallelSorting {
public static void main(String[] args) {
	int[]a= {5,2,6,4,8,9,3};
	Arrays.parallelSort(a);
	for(int i :a){
		System.out.println(i);
	}
}
}

