import java.util.Scanner;

public class MonthlyPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget;
        double amount;
        double totalExpenses = 0;
        int choice;
        int category;

        String[] categories = {
            "Rent",
            "Groceries",
            "Education",
            "Medical",
            "Transport",
            "Entertainment"
        };

        double[] expenses = new double[6];

        System.out.print("Enter your monthly budget: ₹");
        budget = sc.nextDouble();

        do {

            System.out.println("MONTHLY EXPENSE & BUDGET ANALYZER");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Check Budget Status");
            System.out.println("5. Summary Report");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Select Expense Category:");

                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }

                    System.out.print("Enter category: ");
                    category = sc.nextInt();

                    if (category >= 1 && category <= 6) {

                        System.out.print("Enter amount: ₹");
                        amount = sc.nextDouble();

                        expenses[category - 1] += amount;

                        System.out.println(categories[category - 1] + " expense added.");

                    } else {

                        System.out.println("Invalid category!");
                    }

                    break;


                case 2:

                    System.out.println("\n EXPENSES ");

                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(categories[i] + " : ₹" + expenses[i] );
                    }

                    break;


                case 3:

                    totalExpenses = 0;

                    for (int i = 0; i < expenses.length; i++) {
                        totalExpenses += expenses[i];
                    }

                    System.out.println("Total Expenses: ₹" + totalExpenses );

                    break;


                case 4:

                    totalExpenses = 0;

                    for (int i = 0; i < expenses.length; i++) {
                        totalExpenses += expenses[i];
                    }

                    if (totalExpenses > budget) {

                        double overspending = totalExpenses - budget;

                        System.out.println("Total Expenses : ₹" + totalExpenses);
                        System.out.println( "Overspending   : ₹" + overspending );
                        System.out.println("Status : OVER BUDGET");

                    } else {

                        double remaining = budget - totalExpenses;

                        System.out.println("Total Expenses : ₹" + totalExpenses);
                        System.out.println("Remaining : ₹" + remaining);
                        System.out.println("Status : WITHIN BUDGET" );
                    }

                    break;


                case 5:

                    totalExpenses = 0;

                    for (int i = 0; i < expenses.length; i++) {
                        totalExpenses += expenses[i];
                    }

                    System.out.println(" SUMMARY REPORT ");

                    System.out.println("Monthly Budget : ₹" + budget);

                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(categories[i] + " : ₹" + expenses[i]);
                    }

                    System.out.println("Total Expenses : ₹" + totalExpenses );

                    if (totalExpenses > budget) {

                        System.out.println("Status : OVER BUDGET");
                        System.out.println("Overspending : ₹" + (totalExpenses - budget) );

                    } else {

                        System.out.println("Status    : WITHIN BUDGET");
                        System.out.println("Remaining : ₹" + (budget - totalExpenses) );
                    }

                    break;


                case 6:

                    System.out.println("\nThank you for using Monthly Expense & Budget Analyzer!");

                    break;


                default:

                    System.out.println("Invalid choice!");
                    System.out.println(
                        "Please enter a number between 1 and 6."
                    );
            }

        } while (choice != 6);

        sc.close();
    }
}