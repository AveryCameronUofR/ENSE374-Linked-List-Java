package averycameron;

public class LinkedListImplement {
	ListElement head;
	ListElement tail;
	//int index = 0;
	int length = -1;
	public void add(ListElement le) {
		if (tail == null) {
			head = le;
			tail = le;
		} else {
			tail.setNext(le);
			tail = le;
		}
		length++;
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
		ListElement validReturn = new ListElement();
		validReturn.setData(0);
		if(index < this.length) {
			ListElement temp = head;
			ListElement prev = null;
			if (head == tail) {
				head = null;
				tail = null;
				length--;
				return validReturn;
			}
			for(int i = 0; i < index; i++) {
				prev = temp;
				temp = temp.getNext();
			}
			if (temp.getNext() == null) {
				tail = prev;
			}
			if (tail == prev) {
				prev.setNext(temp.getNext());
				length--;
				return tail;
			} else {
				prev.setNext(temp.getNext());
			}
			return prev;
		} else {
			return null;
		}
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
