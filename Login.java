import java.util.*;

public class Login {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Login with Phone Number");
		long regno = 9876543210L;
		System.out.println("Enter Phone Number: ");
		long phno = sc.nextLong();

		{
			System.out.println("Processing...");
			Thread.sleep(1200);
			if (regno == phno) {
				int generateOtp = (int) (Math.random() * 9000) + 1000;
				System.out.println(generateOtp);
				System.out.println("Enter OTP: ");
				int Otp = sc.nextInt();
				System.out.println("Processing...");
				Thread.sleep(1100);
				if (generateOtp == Otp) {
					System.out.println("Login Done Successfully!");
				} else {
					System.out.println("Invalid OTP");
				}
			} else {
				System.out.println("Invalid Phone Number");
			}

		}
	}
}
