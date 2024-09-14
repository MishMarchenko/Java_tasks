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
                System.out.println(sumOfDigitsInNumber(scanner.nextInt()));
                break;
            case 3:
                System.out.println("Enter number and I will check if it is a palindrome");
                scanner.nextLine();
                palindromeChecks(scanner.nextLine());
                break;
//            case 4:
//                System.out.println("tbd");
//                break;
//            case 5:
//                System.out.println("tbd");
//                break;
//            case 6:
//                System.out.println("tbd");
//                break;
//            case 7:
//                System.out.println("tbd");
//                break;
//            case 8:
//                System.out.println("tbd");
//                break;
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
        Scanner scanner = new Scanner(System.in);
        if (a > b){
            System.out.println("First number is less then second. Enter correct numbers.");
            sumOfNumbers(scanner.nextInt(), scanner.nextInt());
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
    public static int sumOfDigitsInNumber(int num){
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
            System.out.println("There is no second max value");
        }
        System.out.println("Max value: " + max);
    }
}
