import java.util.Scanner;

class SumOfNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int no1 = sc.nextInt();

        System.out.println("Enter second no:");
        int no2 = sc.nextInt();

        int sum = no1 + no2;

        System.out.println("Sum is " + sum);
    }
}
	