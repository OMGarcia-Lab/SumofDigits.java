import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        // Any time you want to use user input, import Scanner!!! //
        // Import Scanner, it can be whenever but I prefer having it at the beginning //
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        // this makes num1 be whatever number the user types in //

        // This says if num1 is more than 0 AND less than or equal to 999, the loop will run //
        if (num1 > 0 && num1 <= 999) {
            // Declare your variables //
            int rem1 = 0;
            int sum1 = 0;

            // Make your while loop from
            while (num1 > 0) {
                rem1 = num1 % 10;
                // this one extracts the last digit of num1, i.e 1 //
                sum1 = sum1 + rem1;
                // This adds 1 to the overall sum //
                num1 = num1 / 10;
                // This removes the last digit so now when it runs again it's only the first 2 numbers //
                // This will go on till there's no more numbers //
            }
            System.out.println("Your First Number has the sum of digits of: " + sum1);
        // Add an else statement, for if the user puts a number thats less than 0 or more than 999 //
        }else {
            System.out.println("The Value you entered is Invalid");
            System.out.println("Please only enter a value between 0 and 999 inclusive");
        }
        
        int num2;
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        if (num2 > 0 && num2 <= 999) {

            int rem2 = 0;
            int sum2 = 0;
            while (num2 > 0) {
                rem2 = num2 % 10;
                sum2 = sum2 + rem2;
                num2 = num2 / 10;
            }
            System.out.println("Your Second number has the sum of digits of: " + sum2);
        }else {
            System.out.println("The Value you entered is Invalid");
            System.out.println("Please only enter a value between 0 and 999 inclusive");
        }

        int num3;System.out.print("Enter Third Number: ");
        num3 = sc.nextInt();
        if (num3 > 0 && num3 <= 999) {

            int rem3 = 0;
            int sum3 = 0;
            while (num3 > 0) {
                rem3 = num3 % 10;
                sum3 = sum3 + rem3;
                num3 = num3 / 10;
            }
            System.out.println("Your Third Number has the sum of digits of: " + sum3);
        }else {
            System.out.println("The Value you entered is Invalid");
            System.out.println("Please only enter a value between 0 and 999 inclusive");
        }

    }
}
