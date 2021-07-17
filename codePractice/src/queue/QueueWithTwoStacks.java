package queue;
import java.util.*;

public class QueueWithTwoStacks {
	
	public static void main(String[] args)
	{
	    Queue q = new Queue();
	    q.push(1);
	    q.push(2);
	    q.push(3);
	 
	    System.out.println(q.pop());
	    System.out.println(q.pop());
	    System.out.println(q.pop());
	 
	    
	}
	

	public static class Queue{ 
	    Stack<Integer> s1=new Stack<>();
	    Stack<Integer> s2=new Stack<>();
	    
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	           while(!s1.empty()){
	               s2.push(s1.pop());
	                  
	           }
	           s1.push(x);
	           while(!s2.empty()){
	               s1.push(s2.pop());
	            
	           }
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        
	        int ans=s1.pop();
	        return ans;      
	        
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	      int ans=s1.peek();
	        return ans;
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(s1.empty()){
	            return true;
	        } else {
	            return false;
	        }
	    }
	}
  
}




