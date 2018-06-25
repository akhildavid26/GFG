package linkedList;


//Java program to count occurrences in a linked list
public class NoOfTimesAGivenIntOccursInListHeadRecursion
{
Node head;  // head of list

/* Linked list Node*/
public class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
}

/* Inserts a new Node at front of the list. */
public void push(int new_data)
{
   /* 1 & 2: Allocate the Node &
             Put in the data*/
   Node new_node = new Node(new_data);

   /* 3. Make next of new Node as head */
   new_node.next = head;

   /* 4. Move the head to point to new Node */
   head = new_node;
}

/* Counts the no. of occurences of a node
(search_for) in a linked list (head)*/
int freq=0;
int count(Node head,int search_for)
{
	 if(head==null) {
		 return freq;
	 }
	 if(head.data==search_for)
	 {
		 freq++;
		 
	 }
	 return count(head.next, search_for);
		 
	 
	 
	 
	
   
}


/* Drier function to test the above methods */
public static void main(String args[])
{
   NoOfTimesAGivenIntOccursInListHeadRecursion llist = new NoOfTimesAGivenIntOccursInListHeadRecursion();

   /* Use push() to construct below list
     1->2->1->3->1  */
   llist.push(1);
   llist.push(2);
   llist.push(2);
   llist.push(3);
   llist.push(1);
   llist.push(1);
   llist.push(1);

   /*Checking count function*/
   System.out.println("Count of 1 is "+llist.count(llist.head,1));
}
}
//This code is contributed by Rajat Mishra