package fixbugs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();
    }

    private static void optionsSelection() {
        ArrayList<Integer> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. I wish to review my expenditures");
            System.out.println("2. I wish to Add an expenditure");
            System.out.println("3. I wish to Delete all expenditures");
            System.out.println("4. I wish to Sort expenditures");
            System.out.println("5. I wish to Search for an expenditure");
            System.out.println("6. Close the application");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    if (expenses.isEmpty()) {
                        System.out.println("You have no saved expenses.\n");
                    } else {
                        System.out.println("Your saved expenses are listed below: ");
                        System.out.println(expenses + "\n");
                    }
                    break;
                case 2:
                    System.out.print("Enter the value to add your expense: ");
                    int value = sc.nextInt();
                    expenses.add(value);
                    System.out.println("Your value is updated.\n" + expenses);
                    break;
                case 3:
                    System.out.print("Are you sure you want to delete all your expenses? (1 for Yes, 2 for No): ");
                    int confirmChoice = sc.nextInt();
                    if (confirmChoice == 1) {
                        expenses.clear();
                        System.out.println("All your expenses are erased!\n");
                    } else if (confirmChoice == 2) {
                        System.out.println("Deletion canceled.\n");
                    } else {
                        System.out.println("Invalid choice. Deletion canceled.\n");
                    }
                    break;
                case 4:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses to sort. Please add expenses first.\n");
                    } else {
                        sortExpenses(expenses);
                    }
                    break;
                case 5:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses to search. Please add expenses first.\n");
                    } else {
                        searchExpenses(expenses);
                    }
                    break;
                case 6:
                    closeApp();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.\n");
                    break;
            }
        }
    }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        System.exit(0);
    }

    private static void searchExpenses(ArrayList<Integer> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expense you need to search: ");
        int searchExp = sc.nextInt();

        int index = arrayList.indexOf(searchExp);

        if (index != -1) {
            System.out.println("The expense " + searchExp + " is found at index " + index + "\n");
        } else {
            System.out.println("The expense " + searchExp + " is not found in the list.\n");
        }
    }

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println("The sorted expenses are:");
        for (int expense : arrayList) {
            System.out.println(expense);
        }
        System.out.println();
    }
}
