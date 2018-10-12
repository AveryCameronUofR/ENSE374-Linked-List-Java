/**
 * 
 */
package averycameron;

/**
 * @author avery
 *
 */
public class ListElement {
	private ListElement next;
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
	}
	
	public ListElement(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return this.data;
	}
	
	public ListElement getNext() {
		return this.next;
	}
	public void setNext(ListElement le) {
		this.next = le;
	}

}
