package averycameron;

public class LinkedListImplement {
	ListElement head;
	ListElement tail;
	int length = -1;
	
	/*
	 * Name: add
	 * Takes: ListElement le
	 * Returns: none
	 * 
	 * Purpose: Adds a new list element to the linked List
	 * sets the head and tail for a new list, or increments list along 
	 * increments the length by 1 
	 */
	public void add(ListElement le) {
		if (tail == null) {
			head = le;
			tail = le;
		} else {
			tail.setNext(le);
			le.setPrev(tail);
			tail = le;
		}
		length++;
	}
	
	/*
	 * Name: getElement
	 * Takes: int index 
	 * Returns: ListElement
	 * 
	 * Purpose: Checks if the index is valid and is in the list
	 * if the index is valid, loops through the string and returns the item at the index
	 * Note: index of list starts from 0
	 */
	public ListElement getElement(int index) {

		ListElement temp = head;
		
		if (index < 0 || index > this.length) {
			return null;
		}
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	/*
	 * Name: deleteElement
	 * Takes: int index
	 * Returns: ListElement
	 * 
	 * Purpose: deletes an element at the given index and returns the value that was deleted
	 * if the list is empty or index is out of range, null is returned
	 * if the list contains 1 element, both are set to null
	 * otherwise loops through list until temp listElement holds the value to delete
	 * tempPrev holds the index behind item to delete and points to after the temp's location
	 * 
	 * Length is decremented to keep track of list after deletion
	 * 
	 */
	public ListElement deleteElement(int index) {
		ListElement deletedElement = new ListElement();
		
		//if the index is in the list
		if(index < this.length) {
			ListElement temp = head;
			ListElement tempPrev = null;
			if (head == tail) {
				deletedElement.setData(head.getData());
				head = null;
				tail = null;
				length--;
				return deletedElement;
			}
			//loop through list
			for(int i = 0; i < index; i++) {
				tempPrev = temp;
				temp = temp.getNext();
			}
			//if element is at tail
			if (temp.getNext() == null) {
				deletedElement.setData(temp.getData());
				tail = tempPrev;
				tempPrev.setNext(temp.getNext());
				length--;
				return deletedElement;
			} else if (tempPrev == null) {
				//if the element is in the head, set the head to the next element
				deletedElement.setData(temp.getData());
				head = temp.getNext();
				
			}
			//element is in the middle 
			else {
				tempPrev.setNext(temp.getNext());
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
		ListElement temp = tail;
		//temp is set to the tail, if it is null the list is empty
		if (temp == null) {
			System.out.println("The list is empty");
			return; //returns from the function early
		}
		System.out.print("Tail -> ");
		//loops through the list setting temp to the next item in the list and printing it
		while(temp!=null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getPrev();
		}
		System.out.print("at head\n"); //prints null to indicate end of list 
	}
	
	/*
	 * Name: printLinkedListHead
	 * Takes: None
	 * Return: None
	 * Purpose: prints the starting at the head and going to the tail
	 * loops through the list and uses -> to indicate connections
	 * prints "the list is empty" if list head is null
	 */
	public void printLinkedListHead() {
		ListElement temp = head;
		//temp is set to the head, if it is null the list is empty
		if (temp == null) {
			System.out.println("The list is empty");
			return; //returns from the function early
		} 
		System.out.print("Head -> ");
		//loops through the list setting temp to the next item in the list and printing it
		while(temp!=null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.print("null\n"); //prints null to indicate end of list 
	}
}
