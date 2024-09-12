import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("My home work from AI");
        System.out.println("Which task do you want to check?");
        System.out.println("Enter number from 1 to 8");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Hello, World!");
                break;
            case 2:
                System.out.println("Enter two digits and i will sum them");
                System.out.println(getSum(scanner.nextInt(), scanner.nextInt()));
                break;
            case 3:
                System.out.println("Enter number and I will check even it or odd");
                checkEvenOrOdd(scanner.nextInt());
                break;
            case 4:
                System.out.println("Enter number and I will return factorial of this number");
                System.out.println(getFactorialOfNumber(scanner.nextInt()));
                break;
            case 5:
                System.out.println("Enter a number to check if it's prime:");
                if (isPrime(scanner.nextInt())) {
                    System.out.println("This is a prime number.");
                } else {
                    System.out.println("This is not a prime number.");
                }
                break;
            case 6:
                System.out.println("Enter 3 number and I will find min and max from them");
                minMaxValue(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case 7:
                System.out.println("Enter number and I will output the first numbers of the Fibonacci sequence");
                printFibonacci(scanner.nextInt());
                break;
            case 8:
                scanner.nextLine();
                System.out.println("Enter the word and i will reverse it");
                System.out.println(reverseWord(scanner.nextLine()));
                break;
            default:
                System.out.println("There was no such task)))");
        }

    }
    public static int getSum(int a, int b){
        return a + b;
    }
    public static void checkEvenOrOdd(int a){
        if (a % 2 == 0){
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }
    public static String reverseWord(String str){
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        String newWord = word.toString();
        return newWord;
    }
    public static int getFactorialOfNumber(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++){
            factorial = i * factorial;
        }return factorial;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void minMaxValue(int a, int b, int c){
        int [] array = {a, b, c};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Max value = "+ max);
        System.out.println("Min value = "+ min);
    }
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}