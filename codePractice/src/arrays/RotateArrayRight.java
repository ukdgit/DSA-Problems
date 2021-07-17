package arrays;

import java.util.Scanner;

public class RotateArrayRight {
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);	

			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] nums = new int[n];
			    
			for(int i=0; i<n; i++){
			        nums[i] = sc.nextInt();
			    }
			    
			rotate(nums, k);
			sc.close();
	    }
	    	
	    	
	       public static void rotate(int[]nums, int k) { 
	         int d=-1, temp, j;
			 int N = nums.length;
	        
			   int g_c_d = gcd(N,k);
			    
			   for(int i=N-1; i>=g_c_d; i--){
			      
			       j=i;
			       temp = nums[i];
			          
			      while(true){
			          d = (j+k)%N;
			         
			          if(d==i)
			          break;
			          
			          nums[j] = nums[d];
			          j=d;
			          
			      }
			      nums[j] = temp;
			  }
			    
			    for (int i = 0; i < N; i++)
	            System.out.print(nums[i] + " ");
			    
			}
	
		
		public static int gcd(int a, int b)
	    {
	        if (b == 0)
	            return a;
	        else
	            return gcd(b, a % b);
	    }


}
