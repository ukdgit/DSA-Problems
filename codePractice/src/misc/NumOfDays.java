package misc;
import java.util.Scanner;

public class NumOfDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Solution s = new Solution();
		s.numOfDays(n);
		
		sc.close();
		
		
	}
	
	public static class Solution {
		public void numOfDays(int n) {
		    int months, days, years;
		
		    if(n<360) {
			  months = n/30;
			  days = n%30;
			  System.out.print(0 + "years" + " " + months + "months" + " " + days + "days");
		    } else {
			   years = n/360;
		       months = (n-360)/30;
			   days = n%30;
			   System.out.print(years + "years" + " "  +  months + "months" + " "  +  days + "days" );
			  }
	    }
		
	}
}
