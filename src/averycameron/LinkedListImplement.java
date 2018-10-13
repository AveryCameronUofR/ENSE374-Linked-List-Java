package averycameron;

public class LinkedListImplement {
	ListElement head;
	ListElement tail;
	int length = -1;
	
	//adds a new element and increments the length 
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
	
	//gets element at index given
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
	
	/*
	 * deleteElement
	 * Return ListElement
	 * checks if the index is valid(in the list)
	 * if the head is equal to the tail, and index is valid 
	 * 		there is only 1 element to delete
	 * 		set values to null and return deletedElement
	 * otherwise
	 * 		loop though the list until the the temp element it the one for deletion
	 * 	if the item to delete is the tail, set the prev node's next to null
	 * 	else it is in the middle, prev next (1 before deletion) points to temp next (1 after deletion)
	 * 
	 * length is decremented to keep track of list, deleted element is returned
	 */
	public ListElement deleteElement(int index) {
		ListElement deletedElement = new ListElement();
		
		//if the index is in the list
		if(index < this.length) {
			ListElement temp = head;
			ListElement prev = null;
			if (head == tail) {
				deletedElement.setData(head.getData());
				head = null;
				tail = null;
				length--;
				return deletedElement;
			}
			//loop through list
			for(int i = 0; i < index; i++) {
				prev = temp;
				temp = temp.getNext();
			}
			//if element is at tail
			if (temp.getNext() == null) {
				deletedElement.setData(temp.getData());
				tail = prev;
				prev.setNext(temp.getNext());
				length--;
				return deletedElement;
			}
			//element is in the middle 
			else {
				prev.setNext(temp.getNext());
				deletedElement.setData(temp.getData());
			}
			//return the element that was deleted
			return deletedElement;
		} else {
			//return null to indicate 
			return null;
		}
	}
	
	//will be implemented in phase 2
	public void printLinkedListTail() {
		
	}
	
	//prints the linked list from the head
	public void printLinkedListHead() {
		ListElement temp = head;
		//temp is set to the head, if it is null the list is empty
		if (temp == null) {
			System.out.println("The list is empty");
			return; //returns from the function early
		}
		//loops through the list setting temp to the next item in the list and printing it
		while(temp!=null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.print("null\n");
	}
}
