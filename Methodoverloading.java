import java.util.*;

public class Methodoverloading {
    // Method overloading- Same method name, different parameters
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("This is a Compile time polymorphism illustration");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double aa = sc.nextDouble();
        double bb = sc.nextDouble();
        // add obj=new add();
        System.out.println(add(3, 4));
        System.out.print(add(aa, bb));
    }
}