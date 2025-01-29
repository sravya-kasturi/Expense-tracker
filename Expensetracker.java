import java.util.Scanner;
public class Expensetracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalExpense = 0.0;

        while (true) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expense");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    totalExpense += amount;
                    System.out.println("Expense added!");
                    break;
                case 2:
                    System.out.println("Total Expense: " + totalExpense);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

