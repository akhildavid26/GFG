package linkedList;


/* package whatever; // don't place package name! */
import java.util.*;

class Remove_Duplicate_From_LL
{
    Node head;  
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
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG_removeDuplicates g = new GfG_removeDuplicates();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of Linked List
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
class GfG_removeDuplicates
{
    Node removeDuplicates(Node head)
    {
    	
    	Node temp=head;
    	Node current;
    	while(temp.next!=null) {
    		current=temp;
    		/*
    		 * loop to check until when the elements are same as the current node
    		 */
    		while(current.data==temp.next.data&&temp.next!=null&&temp.next.next!=null) {
    			temp=temp.next;
    		}
    		if(current.data==temp.next.data) {
    			current.next=temp.next.next;
    		}
    		else if (current.data==temp.data) {
				
    			current.next=temp.next;
			}
    		else {
			
    			current.next=temp;
			}
    	if(temp.next==null) {
    		return head;
    	}
    	temp=temp.next;
   		
    	}
		return head;
	
    	
    }
}

