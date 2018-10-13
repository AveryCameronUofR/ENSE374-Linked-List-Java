package averycameron;
import java.util.Scanner;
public class LinkedList {
	
	

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		ListElement le = new ListElement();
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
		list.deleteElement(0);
		
		int flag = -1;
		System.out.print("Welcome to the LinkedList Java Implementation\n");
				
		
		String choice = "1";
		String val;
		int value = 0;
		while (choice.charAt(0) != 'q') {
			System.out.print("Please choose to add(a), delete(d), find(f), or print(p), quit(q)");
			choice = userInput.nextLine();
			if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A') {
				System.out.print("Please enter an integer to add to the list: ");
				val = userInput.nextLine();
				value = parseIntErrorSolver(val, flag);
			
				if (value != flag) {
					list.add(new ListElement(value));
				} else {
					System.out.println("Not a valid input (flag is set to -1)");
				}
			} else if (choice.charAt(0) == 'd' || choice.charAt(0) == 'D') {
				System.out.print("Please enter an index to delete(index starts at 0): ");
				val = userInput.nextLine();
				value = parseIntErrorSolver(val, flag);
			
				if (value >= 0) {
					le = list.deleteElement(value);
					if (le == null) {
						System.out.println("Invalid, index entered doesn't exist");
					}else {
						System.out.println(le.getData() + " was deleted from the list");
					}
				} else {
					System.out.println("Not a valid index, must be greater than or equal to 0");
				}
			} else if (choice.charAt(0) == 'p' || choice.charAt(0) == 'P') {
				list.printLinkedListHead();
			}
		}
		
		userInput.close();
	}
	
	static int parseIntErrorSolver(String input, int defVal) {
		try {
			return Integer.parseInt(input);
		}
		catch (NumberFormatException error) {
			return defVal;
		}
	}
	

}
