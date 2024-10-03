import java.util.Arrays;
import java.util.Scanner;

public class TasksPart2 {
    public static void main(String[] args) {
        System.out.println("My home work from AI");
        System.out.println("Which task do you want to check?");
        System.out.println("Enter number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Enter two digit and I will return you sum all numbers between them include");
                sumOfNumbers(scanner.nextInt(), scanner.nextInt());
                break;
            case 2:
                System.out.println("Enter a number and I will return you number of digits in a number");
                System.out.println(countDigitsInNumber(scanner.nextInt()));
                break;
            case 3:
                System.out.println("Enter number and I will check if it is a palindrome");
                scanner.nextLine();
                palindromeChecks(scanner.nextLine());
                break;
            case 4:
                System.out.println("Enter five numbers and I will get you AVG value form them");
                getAvgValue(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
//            case 5:
//                System.out.println("tbd");
//                break;
            case 6:
                System.out.println("Enter the number and I will return you factorial of this number");
                System.out.println(factorial(scanner.nextInt()));
                break;
            case 7:
                System.out.println("Enter 10 numbers and I will sorted them");
                sortingByBubbleSort(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case 8:
                System.out.println("I made a random number from 1 till 100, try to guess it!");
                guessNumber(scanner.nextInt(), generateNumber());
                break;
//            case 9:
//                System.out.println("tbd");
//                break;
            case 10:
                System.out.println("Enter five numbers and I will return you second max value");
                getSecondMaxValue(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            default:
                System.out.println("There was no such task)))");
        }
    }
    public static void sumOfNumbers(int a, int b){
        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
    }
    public static int countDigitsInNumber(int num){
        return String.valueOf(num).length();
    }
    public static void palindromeChecks(String st){
        st = st.replaceAll("\\s+","").toLowerCase();
        StringBuilder stb = new StringBuilder(st);
        if (st.equals(stb.reverse().toString())){
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }
    public static void getSecondMaxValue(int a, int b, int c, int d, int e){
        int [] array = new int[]{a, b, c, d, e};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        if (max2 != Integer.MIN_VALUE){
            System.out.println("Second max value: " + max2);
        } else {
            System.out.println("All numbers is equal");
        }
        System.out.println("Max value: " + max);
    }
    public static void sortingByBubbleSort(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        int [] array = new int[] {a, b, c, d, e, f, g, h, i, j};
        boolean swapped;
        for (int l = 0; l < array.length - 1; l++) {
            swapped = false;
            for (int m = 0; m < array.length - 1 - l; m++) {
                if (array[m] > array[m + 1]) {
                    int tmp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void getAvgValue(int a, int b, int c, int d, int e){
        int [] array = new int[]{a, b, c, d, e};
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double avg = sum / array.length;
        System.out.println("Avg value is: " + avg);
    }
    public static int factorial(int a){
        if(a == 1 || a == 0){
            return 1;
        }
        return a * factorial(a - 1);
    }
    public static void guessNumber(int a, int b){
        Scanner scanner = new Scanner(System.in);
        if(a == b){
            System.out.println("You did it!");
        } else if (a < b && a > 0) {
            System.out.println("My number is bigger, try again");
            guessNumber(scanner.nextInt(), b);
        } else if(a > b && a < 101){
            System.out.println("My number is less, try again");
            guessNumber(scanner.nextInt(), b);
        } else {
            System.out.println("I have just made the number from 1 till 100. Enter correct number");
            guessNumber(scanner.nextInt(), b);
        }
    }
    public static int generateNumber(){
        int num = (int) (Math.random() * 100) + 1;
        return num;
    }
}
