
public class LinkedList {
	Node head;
	
	public void addFirst(String data) {
		System.out.println("Adding Node " + data + " at First");
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void add(String data) {
		System.out.println("Adding Node " + data);
		if(head == null) {
			System.out.println("No Head Detected Adding " + data + " as Head");
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = newNode;
	}
	
	public void add(String after, String data) {
		System.out.println("Adding Node " + data + " After " + after);
		
		if(head == null) {
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node tempNode = head;
		while(tempNode.next != null) {
			if(tempNode.data == after) {
				System.out.println(after + " found!!");
				break;
			}
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	
	public void deleteFirst() {
		System.out.println("Deleting The First Node");
		if(head == null)
		{
			System.out.println("No Head Detected Can Not Delete");
			return;
		}
		
		head = head.next;
	}
	
	public void deleteLast() {
		System.out.println("Deleting The Last Node");
		if(head == null)
		{
			System.out.println("No Head Detected Can Not Delete");
			return;
		}
		
		Node tempNode = head;
		Node prevNode = null;
		while(tempNode.next != null) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		
		prevNode.next = tempNode.next;
	}
	
	public void printList() {
		System.out.println("Printing Linked List");
		Node tempNode = head;
		System.out.print("[");
		while(tempNode != null) {
			System.out.print(tempNode.data);
			tempNode = tempNode.next;
			if(tempNode != null)
				System.out.print(", ");
		}
		System.out.print("]");
	}
}
