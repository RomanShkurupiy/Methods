import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Unicode output
        char c = '\u21d3';
        char d = '\u231b';
        char e = '\u266c';
        char [] arr = new char[] {'\u272e', '\u274e', '\u277f'};

        System.out.println("Unicode symbols");
        System.out.println(getCodes(c));
        System.out.println(getCodes(d));
        System.out.println(getCodes(e));
        System.out.println(Arrays.toString(getCodesArray(arr)));

        // Overload methods
        int a = 20;
        int b = 35;
        System.out.println("Reload method");
        System.out.println(getSum(a));
        System.out.println(getSum("Text"));
        System.out.println(getSum(a, b));
        System.out.println(getSum(2.4, 8.7));
        System.out.println(getSum(3, 2, 1));
        System.out.println(getSum(2.4, 5));
        System.out.println(getSum(8, 9.8));
        System.out.println(getSum(5L));


        // Raise to the 3rd power
        System.out.print("Enter number to be raised to the power of 3: ");
        int s = scanner.nextInt();
        System.out.println("The 3rd power of " + s +  " is: " + cube(s));


        //Calculator
        System.out.print("Enter first number for Calculator: ");
        double numberFirst = scanner.nextDouble();
        System.out.print("Enter second number for Calculator:  ");
        double numberSecond = scanner.nextDouble();
        System.out.print("Enter operation '+', '-', '*' or '/': ");
        char oper = scanner.next().charAt(0);

        System.out.print("Result of calculator:  ");
        if (oper == '+') {
            System.out.println(numberFirst + " + " + numberSecond + " = " + calcSum(numberFirst, numberSecond));
        }
        else if (oper == '-') {
            System.out.println(numberFirst + " - " + numberSecond + " = " + calcMinus(numberFirst, numberSecond));
        }
        else if (oper == '*') {
            System.out.println(numberFirst + " * " + numberSecond + " = " + calcMultiply(numberFirst, numberSecond));
        }
        else if (oper == '/') {
            System.out.println(numberFirst + " / " + numberSecond + " = " + calcDivide(numberFirst, numberSecond));
        }
        else {
            System.out.println("Entered operation is not correct");
        }

    }
    // Unicode output
    public static char [] getCodesArray(char [] array) {
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return array;
    }

    public static char getCodes (char a) {
        return a;
    }

//Overload methods

    public static int getSum(int a) {
        return a + 1;
    }
    public static String getSum(String a) {
        return "You entered: "+a;
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static double getSum(double a, double b) {
        return a + b;
    }

    public static int getSum(int... a) {
        int[] ab = new int[a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            ab[i] = a[i];
            sum = sum + ab[i];
        }
        return sum;
    }
    public static double getSum(double a, int b) {
        return a + b;
    }
    public static double getSum(int a, double b) {
        return a + b;
    }
    public static long getSum(long a) {
        return a;
    }
    //Raise to the 3rd power
    public static int cube (int a) {
        a = a*a*a;
        return a;
    }

    //Calculator
    public static double calcSum (double a, double b) {
        return a + b;
    }
    public static double calcMinus (double a, double b) {
        return a - b;
    }
    public static double calcMultiply (double a, double b) {
        return a * b;
    }
    public static double calcDivide (double a, double b) {
        return a / b;
    }
}
