package linkedList;

import java.util.*;
/*
 * Not Working
 */
class Is_LinkedList_Palindrom
{
	 Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
			GfG_1 g = new GfG_1();
			if(g.isPalindrome(llist.head) == true)
			System.out.println(1);
		else
			System.out.println(0);
			t--;
		}
		sc.close();
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG_1
{
    boolean isPalindrome(Node head) 
    {
    	Node prev_slow_ptr = null;
    	Node slow_ptr=head;
    	Node fast_ptr=head;
    	Node mid_node = null;
    	Node second_half;
    	
    	while(fast_ptr!=null&&fast_ptr.next.next!=null) {
    		
    		fast_ptr=fast_ptr.next.next;
    		prev_slow_ptr=slow_ptr;
    		slow_ptr=slow_ptr.next;
    		
    	}
    	
    	if(fast_ptr!=null) {
    		
    		mid_node=slow_ptr;
    		slow_ptr=slow_ptr.next;
    	}
   
    	prev_slow_ptr.next=null;
    	second_half=slow_ptr;
    	reverse(second_half);
    	
    	Boolean res = compareLists(head,second_half);
    	
    	reverse(second_half);
    	
    	if(mid_node!=null) {
    		prev_slow_ptr.next=mid_node;
    		mid_node.next=second_half;
    	}
    	else
    		prev_slow_ptr.next=second_half;
    		
		return res;
        
    }

	private Boolean compareLists(Node head, Node second_half) {
		
		Node temp1=head;
		Node temp2=second_half; 
		while(temp1!=null&&temp2!=null) {
			if(temp1.data==temp2.data) {
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else
				return false;
		}
		if(temp1==null&&temp2==null) {
			return true;
			
		}
		
		return false;
		
		
	}

	public void reverse(Node second_half) {
		Node prev=null;
		Node current=second_half;
		Node next_node;
		while(current!=null) {
			
			next_node=current.next;
			current.next=prev;
			prev=current;
			current=next_node;
			
		}
		second_half=prev;
		
	}    
}