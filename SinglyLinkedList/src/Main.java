public class Main {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add("Rasel");
		
		linkedList.deleteFirst();
		
		linkedList.addFirst("Fahim");
		
		linkedList.addFirst("Md.");
		
		linkedList.add("Fahim", "Shahrier");
		
		linkedList.deleteLast();
		
		linkedList.printList();
	}

}
