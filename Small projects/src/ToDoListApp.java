import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class ToDoList {
    private final ArrayList<String> Tasks;

    public ToDoList() {
        this.Tasks = new ArrayList<>();
    }

    public void addTasks(String task) {
        Tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void markAsComplete(int taskNum) {
        if (taskNum >= 1 && taskNum <= Tasks.size()) {
            Tasks.set(taskNum - 1, "[Completed] " + Tasks.get(taskNum - 1));
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number");
        }
    }

    public void listAllTask() {
        if (Tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (int i = 0; i < Tasks.size(); i++) {
                System.out.println((i + 1) + ". " + Tasks.get(i));
            }
        }
    }

    public void deleteTask(int taskNum) {
        if (taskNum >= 1 && taskNum <= Tasks.size()) {
            Tasks.remove(taskNum - 1);
            System.out.println("Task has been deleted successfully");
        } else {
            System.out.println("Invalid task number");
        }
    }
}

public class ToDoListApp {


    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String option;

        boolean exit = false;
        System.out.println("Welcome to the To-Do List App!");
        System.out.println("Commands:");
        System.out.println("1. Add a task");
        System.out.println("2. Mark a task as completed");
        System.out.println("3. List all tasks");
        System.out.println("4. Delete a task");
        System.out.println("5. Exit");

        while (!exit) {
            System.out.println();
            System.out.println("Enter your command: ");

            option = scanner.nextLine();


            switch (option) {
                case "1":
                    System.out.println("Enter task description");
                    String taskAdd = scanner.nextLine();
                    todoList.addTasks(taskAdd);
                    break;

                case "2":
                    System.out.println("Enter the number of the task to mark as completed: ");
                    try {
                        int taskNum = scanner.nextInt();
                        scanner.nextLine();
                        todoList.markAsComplete(taskNum);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid task numbers");

                    }
                    break;

                case "3":
                    todoList.listAllTask();
                    break;

                case "4":
                    try {

                        System.out.println("Enter the number of the task to delete: ");
                        int deleteTask = scanner.nextInt();
                        scanner.nextLine();
                        todoList.deleteTask(deleteTask);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid task numbers");
                        scanner.nextLine();
                    }

                    break;
                case "5":
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid command, please try again");

            }

        }


    }
}
