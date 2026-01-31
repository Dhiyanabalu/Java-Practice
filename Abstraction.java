
import java.util.*;

public class Abstraction// Hides implementation
{
    static abstract class abs {
        void normalmethod() {
            System.out.println("This is a noraml method");
        }

        abstract void absmethod();
    }

    static class demo extends abs {
        @Override
        void absmethod() {
            System.out.println("This is a abstract method");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a abstraction illustration");
        demo obj = new demo();// obj creation
        obj.normalmethod();
        obj.absmethod();
        System.out.println();
    }
}
