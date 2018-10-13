package averycameron;

public class LinkedList {

	public static void main(String[] args) {
		
		//ListElement le = new ListElement();
		LinkedListImplement list = new LinkedListImplement();

		//adds 3 new nodes to LinkedListImplement
		//new ListElement(int data) creates a new List Element using constructor
		list.add(new ListElement(5));
		list.add(new ListElement(10));
		list.add(new ListElement(51));
		System.out.println("element is " + list.getElement(2).getData());
		list.printLinkedListHead();
		list.deleteElement(1);
		list.printLinkedListHead();
		list.deleteElement(1);
		list.printLinkedListHead();
		list.deleteElement(0);
		list.printLinkedListHead();
		list.add(new ListElement(21));
		list.printLinkedListHead();
	}

}
