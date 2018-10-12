package averycameron;

public class LinkedListImplement {
	ListElement head;
	ListElement tail;
	int index = 0;
	public void add(ListElement le) {
		if (tail == null) {
			head = le;
			tail = le;
		} else {
			tail.setNext(le);
			tail = le;
		}
	}
	/*
	 * In progress
	public ListElement getElement(int index) {

		ListElement temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	*/
	
	/*
	 * In Progress
	public ListElement deleteElement(int index) {
		
		ListElement temp = head;
		ListElement prev = null;
		
		return
		 
	}
	*/
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}
