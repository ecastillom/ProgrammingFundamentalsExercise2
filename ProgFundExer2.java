import java.util.Scanner;

public class ProgFundExer2{
   public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
        String Employee;
        int Age;
        float MonthSalary;
        float DailySalary;
        
        System.out.println("What is my Daily Salary? ");
        System.out.println(" ");
        System.out.println("Enter the name of the employee: ");
        Employee = sc.nextLine();

        System.out.println("Enter the age of the employee: ");
        Age = sc.nextInt();

        System.out.println("Enter the Month Salary of the Employee: ");
        MonthSalary = sc.nextFloat();

        DailySalary = (MonthSalary / 30);

        System.out.println("The Employee " + Employee + " with " + Age + " years old " + " receive $" + DailySalary + " by Day" );

   }
}