
import java.util.Scanner;

public class ToDo {

	public static void main(String[] args) {
		
		ToDoList list = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		String choice;
		String item;
		int check;
		
		while(true) {
			check = 1;
			item = "";
			System.out.println("\nEnter number to take action: ");
			System.out.println("1 - Add a Task");
			System.out.println("2 - Remove a Task by Index");
			System.out.println("3 - Print the List");
			
			
			choice = scanner.nextLine();
			
			switch (choice) {
			case "1":
				while (!item.equals("0")) {
				System.out.println("Enter Task or type number 0 for different command: ");
				item = scanner.nextLine();
				
				if (!item.equals("0")) {
				list.addTask(item);
				System.out.println("Item Added");
				}
				}
				break;
				
			case "2":
				while (check != 0) {
				list.showList();
				System.out.println("Select index to remove or type number 0 for different command: ");
				check = scanner.nextInt();
				if (check != 0) {
					list.removeTask(check);
					System.out.println("Task Removed.\n");
				}
				}
				break;
			case "3":
				list.showList();
				break;
				
			default:
				System.out.println("Invalid command, please try again.");
				break;
			}
		}

	}

}
