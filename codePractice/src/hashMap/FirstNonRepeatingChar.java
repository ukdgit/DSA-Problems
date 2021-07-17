package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.print(solution(str));
		
		sc.close();
		
	}
	
	public static int solution(String str) {
		
		HashMap<Character, Integer> fmap = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(fmap.get(ch)==1) {
				return i;
			}
		}
		return -1;
		
	}
}
