package arrays;

import java.util.Scanner;

public class RotateArrayLeft {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		

		while(T>0){
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int[] arr = new int[N];
		    
		    for(int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		   
		    D%= N;
		    reverse(arr, 0, D-1);
		    reverse(arr, D, N-1);
		    reverse(arr, 0, N-1);
		    
		    for(int num: arr) {
		    	System.out.print(num + " ");
		    }
		    
		} T--;
		 
		sc.close();

   }
    public static void reverse(int[] arr, int l, int r){
        int temp = 0;
        while(l<r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            l++;
            r--;
        }
      
    }

}
