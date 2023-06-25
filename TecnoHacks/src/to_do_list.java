import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

public class to_do_list {

	
	
	    private List<String> items;

	    public to_do_list() {
	        items = new ArrayList<>();
	    }

	    public void addItem(String item) {
	        items.add(item);
	        System.out.println("Item added: " + item);
	    }

	    public void removeItem(int index) {
	        if (index >= 0 && index < items.size()) {
	            String removedItem = items.remove(index);
	            System.out.println("Item removed: " + removedItem);
	        } else {
	            System.out.println("Invalid index!");
	        }
	    }

	    public void viewItems() {
	        if (items.isEmpty()) {
	            System.out.println("Todo list is empty");
	        } else {
	            System.out.println("Todo list:");
	            for (int i = 0; i < items.size(); i++) {
	                System.out.println((i + 1) + ". " + items.get(i));
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	to_do_list todoList = new to_do_list();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println();
	            System.out.println("----- Todo List -----");
	            System.out.println("1. Add item");
	            System.out.println("2. Remove item");
	            System.out.println("3. View items");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item: ");
	                    String item = scanner.nextLine();
	                    todoList.addItem(item);
	                    break;
	                case 2:
	                    System.out.print("Enter item index: ");
	                    int index = scanner.nextInt();
	                    todoList.removeItem(index - 1);
	                    break;
	                case 3:
	                    todoList.viewItems();
	                    break;
	                case 4:
	                    System.out.println("Exiting program...");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	                    break;
	            }
	        }
	    }
	}



