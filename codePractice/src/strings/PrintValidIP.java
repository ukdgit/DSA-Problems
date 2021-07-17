package strings;

import java.util.ArrayList;
import java.util.List;

public class PrintValidIP {

	public static void main(String[] args) {

		PrintValidIP vip = new PrintValidIP();
		
		System.out.print(vip.restoreIpAddresses("25525511135"));

	}

	    public List<String> restoreIpAddresses(String s) {
	        List<String> validIPs = new ArrayList<>();
	        int len = s.length();

	        if (len > 12 || len < 4) {
	            return validIPs;
	        }
	        
	        for (int i=0; i<Math.min(3, len-3); i++) {
	            for (int j=(i+1); j<Math.min((i+4), (len-2)); j++) {
	                for (int k=(j+1); k<Math.min((j+4), (len-1)); k++) {
	                    String s1 = s.substring(0, i+1);
	                    String s2 = s.substring(i+1, j+1);
	                    String s3 = s.substring(j+1, k+1);
	                    String s4 = s.substring(k+1, len);

	                    if (isValidIPInt(s1) && isValidIPInt(s2) && isValidIPInt(s3) && isValidIPInt(s4)) {
	                        validIPs.add(s1 + "." + s2 + "." + s3 + "." + s4);
	                    }
	                }
	            }
	        }
	        return validIPs;
	    }

	    private boolean isValidIPInt(String str) {
	        if (str.length() == 0 || (str.charAt(0) == '0' && str.length() > 1) || str.length() > 3 || Integer.valueOf(str) > 255)
	            return false;
	        return true;
	    }



}

//DFS BACKTRACKING
//class Solution {
//    public List<String> restoreIpAddresses(String s) {
//        
//        List<String> res = new ArrayList<>();
//        if(s==null || s.length()<4 || s.length()>12){
//            return res;
//        }
//        dfs(s, "", 0, res);
//        return res;
//        
//   }
//    private void dfs(String s, String sub, int index, List<String> res){
//        //base case check
//        if(index == 4 || s.length() == 0){
//            if(index == 4 && s.length() == 0){
//                res.add(sub.substring(0, sub.length() - 1));
//            }
//            return;
//        }
//        //choose 1 digit
//        dfs(s.substring(1), sub + s.substring(0, 1) + ".", index + 1, res);
//        //choose 2 digit
//        if(s.length()>1 && s.charAt(0) != '0'){
//            dfs(s.substring(2), sub + s.substring(0, 2) + ".", index + 1, res);
//            //choose 3 digits
//            if(s.length()>2 && Integer.valueOf(s.substring(0,3))<=255){
//                dfs(s.substring(3), sub + s.substring(0,3) + ".", index + 1, res);
//            }
//        }
//        
//    }
//}

