/**
 * 
 */
package averycameron;

/**
 * @author avery
 *	List Element class, creates nodes for linked list
 */
public class ListElement {
	private ListElement next;
	private int data;
	
	/* Default constructor of new ListElement
	 * Sets data to 0 and next to null
	 */
	public ListElement() {
		this.data = 0;
		this.next = null;
	}
	
	/*
	 * Takes: int data
	 * Purpose: initialize a list element with data value
	 */
	public ListElement(int data) {
		this.data = data;
		this.next = null;
	}
	
	//sets data of list element
	public void setData(int data) {
		this.data = data;
	}
	
	//gets the data of the list element
	public int getData() {
		return this.data;
	}
	
	//gets the item linked to the element
	public ListElement getNext() {
		return this.next;
	}
	
	//sets the item linked to the element
	public void setNext(ListElement le) {
		this.next = le;
	}

}
