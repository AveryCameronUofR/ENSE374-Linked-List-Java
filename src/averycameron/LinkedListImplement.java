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

	public ListElement getElement(int index) {

		ListElement temp = head;
		if (index < 0) {
			return null;
		}
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	

	public ListElement deleteElement(int index) {
		
		ListElement temp = head;
		ListElement prev = null;
		if (head == tail) {
			head = null;
			tail = null;
			return prev;
		}
		for(int i = 0; i < index; i++) {
			prev = temp;
			temp = temp.getNext();
		}
		if (temp.getNext() == null) {
			tail = prev;
		}
		prev.setNext(temp.getNext());
		return prev;
		 
	}

	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		ListElement temp = head;
		if (temp == null) {
			System.out.println("The list is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.print("null\n");
	}
}
