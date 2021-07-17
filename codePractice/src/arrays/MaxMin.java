package arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		 int i=0;
		 int max = 0;
		 while(i<n) {
			 if(arr[i]>max) {
				 max = arr[i];
			 }
			 i++;
		 }
		 
		 System.out.print("Maximum number is:"+" " + max);
		 sc.close();
	}
}
