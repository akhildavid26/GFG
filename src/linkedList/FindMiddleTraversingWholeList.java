package linkedList;
import java.util.*;

public class FindMiddleTraversingWholeList
{
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
	    }else{
	    	/*
	    	 * Case when one or more nodes are present
	    	 */
	    	Node temp = head;
	    	while (temp.next != null)
	    	temp = temp.next;
	    	temp.next = node;
	    	node.next=null;
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
			FindMiddleTraversingWholeList singlyLinkedList = new FindMiddleTraversingWholeList();
			int headNodeData=sc.nextInt();
			Node head= new Node(headNodeData);
            singlyLinkedList.addToTheLast(head);
            for (int i = 1; i < numberOfNodes; i++) 
			{
				int nodeData = sc.nextInt(); 
				singlyLinkedList.addToTheLast(new Node(nodeData));
			}
         FindMiddleTraversingWholeListLogic obj = new FindMiddleTraversingWholeListLogic(); 
       
         System.out.println(obj.getMiddle(singlyLinkedList.head));
         
         numberOfTestCases--;
		}
		
		sc.close();
	}
}

class FindMiddleTraversingWholeListLogic
{
    /*
     *  Function to find middle element a linked list
     */
    int getMiddle(Node head)
   {
    	Node temp=head;
    	int len=0;
    	while(temp!=null) {
    		len++;
    		temp=temp.next;
    	}
    	temp=head;
    	for (int i=1;i<=len/2;i++) {
    		
    		temp=temp.next;
    	}
    	
    	return temp.data;
        /*
         * Two loops  
         * 1) One complete
         * 2) One half
         * Highly inefficient 
         */
   }
}