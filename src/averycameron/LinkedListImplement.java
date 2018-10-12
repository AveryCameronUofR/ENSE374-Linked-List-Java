package averycameron;

public class LinkedListImplement {
	ListElement head;
	ListElement tail;
	int index = 0;
	public void add(ListElement le) {
		
	}
	
	public ListElement getElement(int index) {
		ListElement temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	public ListElement deleteElement(int index) {
		
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}
