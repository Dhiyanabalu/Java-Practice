import java.util.*;

public class SlidingwindowMaxsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key:");
        int k = sc.nextInt();
        if (n < k) {
            System.out.println("Invalid, can't compute Maximum sum");
            return;
        } else {
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            int maxsum = sum;
            for (int i = k; i < n; i++) {
                sum = sum + arr[i] - arr[i - k];
                maxsum = Math.max(maxsum, sum);
            }

            System.out.println("Maximum sum in the array with window key " + k + " is " + maxsum);

        }
    }
}
