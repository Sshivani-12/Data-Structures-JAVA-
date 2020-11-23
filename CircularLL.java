// Java program to implement 
// the above approach 
class CircularLL 
{ 

// node 
static class Node 
{ 
	int data; 
	Node next; 
}; 

/* Function to insert a node 
at the beginning of a Circular 
linked list */
static Node push(Node head, int data) 
{ 
	Node newnode = new Node(); 
	Node temp = head; 
	newnode.data = data; 
	newnode.next = head; 

	/* If linked list is not null 
	then set the next of last node */
	if (head != null) 
	{ 
		while (temp.next != head) 
			temp = temp.next; 
		temp.next = newnode; 
	} 
	else
		newnode.next = newnode; 

	head = newnode; 
	
	return head; 
} 

/* Function to print nodes in a 
given Circular linked list */
static void printList(Node head1) 
{ 
	Node temp1 = head1; 
	if (head1 != null) 
	{ 
		do
		{ 
			System.out.print(temp1.data + " "); 
			temp1 = temp1.next; 
		} 
		while (temp1 != head1); 
	} 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	/* Initialize lists as empty */
	Node head = null; 

	/* Created linked list will 
	be 11.2.56.12 */
	head = push(head, 12); 
	head = push(head, 56); 
	head = push(head, 2); 
	head = push(head, 11); 

	System.out.println("Contents of Circular " + 
								"Linked List:"); 
	printList(head); 
} 
} 

// This code is contributed 
// by Arnab Kundu 
