package linkedList;

import java.io.*;


public class ReverseALinkedListIterative
{
	Node head;  	/* head node of list*/
	Node lastNode;	/* Last node of list*/
	static PrintWriter out;
	
	/* Inserts a new Node at front of the list. */
	public void addToTheLast(Node node)
	{
		if (head == null)
		{
			head = node;
			lastNode = node;
		}
		else
		{
			lastNode.next = node;
			lastNode = node;
		}
	}
	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			out.print(temp.data+" ");
			temp = temp.next;
		}
		out.println();
	}
	
	
	public static void main(String args[]) throws IOException
	{
		/*
		 * 1) First enter the number of Test Cases
		 * 2) Then enter the number of nodes for the first test case
		 * 3) Then enter the node data separated by space
		 * 4) Repeat from 2 for next test case
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new BufferedOutputStream(System.out));
		int numberOfTestCases= Integer.parseInt(br.readLine());
		while(numberOfTestCases>0)
		{
			int numberOfNodes = Integer.parseInt(br.readLine());
			ReverseALinkedListIterative singlyLinkedList = new ReverseALinkedListIterative();
			String nums[] = br.readLine().split(" ");
			if (numberOfNodes > 0)
			{
				int headNodeData= Integer.parseInt(nums[0]);
				Node head= new Node(headNodeData);
				singlyLinkedList.addToTheLast(head);
			}
			for (int i = 1; i < numberOfNodes; i++)
			{
				int nodeData = Integer.parseInt(nums[i]);
				singlyLinkedList.addToTheLast(new Node(nodeData));
			}
			singlyLinkedList.head = new ReverseALinkedListIterativeLogic().reverse(singlyLinkedList.head);

			singlyLinkedList.printList();

			numberOfTestCases--;
		}
		out.close();
	}
}

class ReverseALinkedListIterativeLogic
{
	/*
	 * Function to reverse the linked List
	 * Returns the head of the Linked List
	 */
	Node reverse(Node head)
	{
		Node previous=null,next=null;
		Node current = head;

		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;

		return head;
	}
}