package linkedList;
import java.util.*;

public class FindMiddleUsingCounter{
    Node head;  /* head of list */
    
    /*
     * Function for adding node at the end of singly Linked List
     */
    public void addToTheLast(Node node) {
    	if (head == null) {
    		/*
    		 * Case when no node in the list
    		 */
    		head = node;
    	} else {
    		/*
	    	 * Case when one or more nodes are present
	    	 */
    		Node temp = head;
    		while (temp.next != null)
    			temp = temp.next;
    			temp.next = node;
    	}
    }
	  
    public static void main(String args[]){
    	/*
    	 * 1) First enter the number of test cases you want to run the program
    	 * 2) Then enter the number of elements for the first test case
    	 * 3) Then enter the elements
    	 * 4) It will show you the middle for the first test case
    	 * 5) Next enter the number of elements for the second test case
    	 * 6) Repeat from step 2 then
    	 */
         Scanner sc = new Scanner(System.in);
		 int numberOfTestCases=sc.nextInt();
		 
		 while(numberOfTestCases>0){
			int numberOfNodes = sc.nextInt();
			FindMiddleUsingCounter singlyLinkedList = new FindMiddleUsingCounter();
			
			int headNodeData=sc.nextInt();
			Node head= new Node(headNodeData);
            singlyLinkedList.addToTheLast(head);
            for (int i = 1; i <numberOfNodes ; i++) {
				int nodeData = sc.nextInt(); 
				singlyLinkedList.addToTheLast(new Node(nodeData));
			}
          
            FindMiddleUsingCountersLogic gfgobj = new FindMiddleUsingCountersLogic(); 
            System.out.println(gfgobj.getMiddle(singlyLinkedList.head));
            numberOfTestCases--;
		}
		 sc.close();
	}
}

class FindMiddleUsingCountersLogic{
    /*
     * Function to find middle element a linked list
     * Will return second middle element if number of elements in the node are even
     */
    int getMiddle(Node head){
    	Node mid=head;
    	Node temp=head;
    	int counter=0;   
    	while(temp!=null) {
    		if(counter%2!=0) {
    			mid=mid.next;
    		}
    		counter++;
    		temp=temp.next;
    	}
    	return mid.data;
        /*
         * One complete loop
         * Still inefficient
         */
   }
}