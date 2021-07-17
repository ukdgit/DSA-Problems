package hashMap;

import java.util.*;

public class TwoSum {
	public static void main(String[] args)
	{
	  
	 
	    
	}

	
	static class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int n= nums.length;
	    
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i=0; i<n; i++){
	          
	            int numberToFind = target-nums[i];
	            if(map.containsKey(numberToFind)){
	                return new int[] {map.get(numberToFind), i};
	            } else {
	                map.put(nums[i],i);
	            }
	        }
	        return new int[] {};
	    }
	}
}
