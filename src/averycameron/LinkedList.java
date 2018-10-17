package averycameron;
import java.util.Scanner;
public class LinkedList {
	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		ListElement le = new ListElement();
		LinkedListImplement list = new LinkedListImplement();

	/*
	 * Automatic example of ListElement and LinkedListImplementation class
	 * adds new elements and deletes various elements and prints list
	 */
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
		list.printLinkedListHead();
		
		
		int flag = -1;
		System.out.print("\n\nWelcome to the LinkedList Java Implementation\n");
		String choice = "1";
		String val;
		int value = 0;
		
		/*
		 * uses the java.util.Scanner to get user input in the form of a string
		 * loops continuously while input does not start with q
		 * choice options:
		 * a- add
		 * Adds an element after retrieving the value to enter (value is checked for validity)
		 * d- delete
		 * deletes an element based on index (starts at 0) after checking index 
		 * r- retrieve
		 * retrieves an element using getElement using index, after checking validity
		 * p- print
		 * prints list in current state
		 * else
		 * prints error message
		 */
		while (choice.charAt(0) != 'q') {
			System.out.print("Please choose to add(a), delete(d), retrieve(r), or print(p), quit(q)");
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
				}
				
			} else if (choice.charAt(0) == 'r' || choice.charAt(0) == 'R') {
					System.out.print("Please enter an index to search(index starts at 0): ");
					val = userInput.nextLine();
					value = parseIntErrorSolver(val, flag);
				
					if (value >= 0) {
						le = list.getElement(value);
						if (le == null) {
							System.out.println("Invalid, index entered doesn't exist");
						}else {
							System.out.println(le.getData() + " is held at index " + val);
						}
					} else {
					System.out.println("Not a valid index, must be greater than or equal to 0");
					}
					
			} else if (choice.charAt(0) == 'p' || choice.charAt(0) == 'P') {
				list.printLinkedListHead();
			} else if (choice.charAt(0) == 'q' || choice.charAt(0) == 'Q'){
				System.out.println("Program Exited");
			} else {
				System.out.println("Not a valid Input choice, ensure initial character is correct");
			}
		}
		
		//closes input stream 
		userInput.close();
	}
	
	/*
	 * Name: parseIntErrorSolver
	 * Takes: String input, int defVal
	 * Purpose: parse the string for integer and return, return defVal if parsing fails
	 * 
	 * Error handler that tries to parse String input for integer value
	 * if the parsing fails, a NumberFormatException is thrown
	 * error handler catches the exception and returns the default value, defVal to indicate failiure
	 */
	static int parseIntErrorSolver(String input, int defVal) {
		try {
			return Integer.parseInt(input);
		}
		catch (NumberFormatException error) {
			return defVal;
		}
	}
	

}
