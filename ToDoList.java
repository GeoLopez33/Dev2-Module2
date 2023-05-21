import java.util.ArrayList;

public class ToDoList {

	ArrayList<String> tasks = new ArrayList<>();
	
	public void addTask(String t) {
		tasks.add(t);
	}
	
	public void removeTask(int n) {
		try{tasks.remove(n-1);
		
		}catch (Exception e) {
			System.out.println("Index not present");
		};
	}
	
	public void showList() {
		System.out.println("Current ToDo List:");
		if (!tasks.isEmpty())
		for (int i =0; i < tasks.size(); i++) {
			System.out.println((i+1) + ". " + tasks.get(i));
		}else {
			System.out.println("List is currently empty\n");
		}
		
	}
}
