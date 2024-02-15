package in.co.rays.OOPS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logics {
   public void palindrome(int number) {
   
	   int sum = 0;
	   int r = 0;
	   int n = number;
	   
	   while(n>0) {
		   r= n%10;
		   sum = sum*10+r;
		   n = n/10;}
		   
		   if (sum == number) {
			   System.out.println("Palindrome Number");
		   }
		   else {
			   System.out.println("Not Palindrome Number");
		   }
	   }
   public void date(String s) throws ParseException {
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			   Date d = sdf.parse(s);
			   System.out.println(d);
			   
   }
   public int secMax(int []a) {
	   int min = 0;
	   int max = 0;
	   for (int i = 0; i < a.length; i++) {
		   if(a[i]>max) {
			   min = max;
			   max = a[i];
			   
		   }
		   if (a[i]>min && a[i]<max) {
			   min = a[i];
			
		}
		
	}
	   return min;
	   
   }
   
   public void bubbleSort(int []arr) {
	   int temp = 0;
	   for (int i = 0; i < arr.length; i++) {
		   for (int j = i+1; j < arr.length; j++) {
			   if(arr[i]>arr[j]) {
				   temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]= temp;
			   }
			
		}
		   System.out.print(" "+arr[i]);
		
	}
   }
   
   public void dateFormat(String s) {
	   Date d = new Date();
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 String s1 =sdf.format(d) ;
	 System.out.println(s);
	 
   }
   
} 

