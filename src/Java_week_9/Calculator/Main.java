package Java_week_9.Calculator;


import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Main cal = new Main();

        while (true) {
            System.out.println("Enter first number");
            int num1 = read.nextInt();
            System.out.println("Enter second number");
            int num2 = read.nextInt();
            System.out.println("Choose the operator +, -, *, / ");
            char op = read.next().charAt(0);

            try {
                cal.calculateResult(num1, num2, op);
            }
            catch (ArithmeticException e){
                System.out.println("Invalid Operation");
                System.out.println(e.getMessage());
            }

            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N':");
            char ans = read.next().charAt(0);

            if(ans == 'n' || ans == 'N'){
                break;
            }
        }

        read.close();
    }

    public void calculateResult(int a, int b, char ch){
        if(ch == '+'){

            addition(a,b);
        } else if (ch == '-') {
            subtraction(a,b);
        } else if (ch == '*') {
            multiplication(a,b);
        } else if (ch == '/') {
            division(a,b);
        } else {
            System.out.println("Invalid input");
        }
    }
}
