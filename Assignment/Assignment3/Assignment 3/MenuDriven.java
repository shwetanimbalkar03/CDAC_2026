import java.util.Scanner;

class MenuDriven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Grade Evaluation");
            System.out.println("2. Leap Year");
            System.out.println("3. Day of Week");
            System.out.println("4. Default Values");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    int avg = 70;

                    if(avg >= 90) {
                        System.out.println("Grade A");
                    }
                    else if(avg >= 70) {
                        System.out.println("Grade B");
                    }
                    else if(avg >= 50) {
                        System.out.println("Grade C");
                    }
                    else if(avg >= 30) {
                        System.out.println("Grade D");
                    }
                    else {
                        System.out.println("Fail");
                    }
                    break;

                case 2:
                    int year = 2024;

                    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println(year + " is Leap Year");
                    }
                    else {
                        System.out.println(year + " is not Leap Year");
                    }
                    break;

                case 3:
                    int day = 3;

                    switch(day) {
                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("Friday");
                            break;

                        case 6:
                            System.out.println("Saturday");
                            break;

                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("Invalid day number");
                    }
                    break;

                case 4:
                    DataType obj = new DataType();

                    System.out.println(obj.a);
                    System.out.println(obj.b);
                    System.out.println(obj.c);
                    System.out.println(obj.d);
                    System.out.println(obj.e);
                    System.out.println(obj.f);
                    System.out.println(obj.g);
                    System.out.println(obj.h);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }
}

class DataType {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
}