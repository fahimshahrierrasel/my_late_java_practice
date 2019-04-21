
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
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("No Head Detected Adding " + data + " as Head");
			head = newNode;
			return;
		}
		
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = newNode;
	}
	
	public void printList() {
		System.out.println("Printing Linked List");
		Node tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
}
