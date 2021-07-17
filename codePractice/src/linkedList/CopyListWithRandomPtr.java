package linkedList;
import java.util.*;


public class CopyListWithRandomPtr {
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	
	Node[] arr = new Node[n];
	Node prev = null;
	
	for(int i=0; i<n; i++) {
		arr[i] = new Node(0);
		if(prev!=null) {
			prev.next=arr[i];
		}
	}
	
		
	}
		

		class Solution {
			
			    int val;
			    Node next;
			    Node random;

			    public Node(int val) {
			        this.val = val;
			        this.next = null;
			        this.random = null;
			    }
			
			
		    public Node copyRandomList(Node head) {
		        HashMap<Node, Node> map = new HashMap<>();
		        Node curr = head;
		        Node newHead = new Node(-1);
		        Node prev = newHead;
		        
		        while(curr!=null){
		            Node node = new Node(curr.val);
		            map.put(curr, node);
		            prev.next = node;
		            prev = prev.next;
		            curr = curr.next;
		        }
		        newHead = newHead.next;
		        Node c1 = head;
		        Node c2 = newHead;
		        
		        while(c2!=null){
		            c2.random = (c1.random != null ? map.get(c1.random) : null);
		            c1 = c1.next;
		            c2 = c2.next;
		        }
		        return newHead;
		    }
		}

}

