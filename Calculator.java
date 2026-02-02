import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt;

        System.out.println("\tCalculator");

        do {
            System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter any option: ");

            opt = sc.nextInt();

            switch (opt) {

                case 1: {
                    System.out.print("Addition: How many numbers do you want to add? ");
                    int n = sc.nextInt();

                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Enter number " + i + ": ");
                        int num = sc.nextInt();
                        sum += num;
                    }
                    System.out.println("Answer: " + sum);
                    break;
                }

                case 2: {
                    System.out.print("Subtraction: How many numbers do you want to subtract? ");
                    int n = sc.nextInt();

                    System.out.print("Enter number 1: ");
                    int result = sc.nextInt();

                    for (int i = 2; i <= n; i++) {
                        System.out.print("Enter number " + i + ": ");
                        int num = sc.nextInt();
                        result -= num;
                    }
                    System.out.println("Answer: " + result);
                    break;
                }

                case 3: {
                    System.out.print("Multiplication: How many numbers do you want to multiply? ");
                    int n = sc.nextInt();

                    int mul = 1;
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Enter number " + i + ": ");
                        int num = sc.nextInt();
                        mul *= num;
                    }
                    System.out.println("Answer: " + mul);
                    break;
                }

                case 4: {
                    System.out.print("Enter number 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    double n2 = sc.nextDouble();

                    if (n2 == 0) {
                        System.out.println("Can't divide by 0");
                    } else {
                        System.out.println("Answer: " + (n1 / n2));
                    }
                    break;
                }

                case 5:
                    System.out.println("Exiting... Done!");
                    break;

                default:
                    System.out.println("Invalid Option");
            }

        } while (opt != 5);  

        sc.close();
    }
}
