package in.co.rays.basics;

public class SecMaxInArray {
public static void main(String[] args) {
	int []a= {2,6,98,45,3,48};
	int Secmax=0;
	int Max=0;
	
	for (int i = 0; i < a.length; i++) {
		if (a[i]>Max) {
			Secmax=Max; 
			Max=a[i];	
			}
			if (a[i]>Secmax && a[i]<Max) {
				Secmax=a[i];
				
				
			}
		
			
		}
		System.out.println(Secmax);
	}

}

