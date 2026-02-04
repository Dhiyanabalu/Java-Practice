import java.util.*;

public class Qorders {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Swomato App");
		System.out.println("Select a Restaurant You want to place order!");
		System.out.println("1.SS Hyderabad \n2.A2B\n 3.Anjappar Restaurant\n ");
		int rest = sc.nextInt();
		switch (rest) {

			case 1:
				System.out.println("Welcome to SS Hyderabad");
				System.out.println("Select your favourite Dish to order");
				System.out.println(
						"1.Mutton biriyani ---- Rs.220\n2.Chicken Biriyani ---- Rs.180\n3.Prawn Biriyani ---- Rs.180\n");
				int menu = sc.nextInt();
				switch (menu) {
					case 1: {
						System.out.println("Mutton Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 220 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}

							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}

					case 2: {
						System.out.println("Chicken Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 180 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}

							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}

					case 3: {
						System.out.println("Prawn Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 180 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}

							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}
					default:
						System.out.println("Invalid");

				}
				break;

			case 2: {
				System.out.println("Welcome to A2B");
				System.out.println("Select your favourite Dish to order");
				System.out.println("1.Gobi Rice ---- Rs.100\n2.Meals ---- Rs.150\n3.Veg Biriyani ---- Rs.120\n");
				int menuA2B = sc.nextInt();
				switch (menuA2B) {
					case 1: {
						System.out.println("Gobi Rice");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 100 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}

					case 2: {
						System.out.println("Meals");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 150 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");// 61
						}
						break;
					}

					case 3: {
						System.out.println("Veg biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 120 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}
					default:
						System.out.println("Invalid");

				}
				break;
			}
			case 3: {
				System.out.println("Welcome to Anjappar Restaurant\n");
				System.out.println("Select your favourite Dish to order");
				System.out
						.println("1.Mutton biriyani ---- Rs.240\n2.Chicken Biriyani ---- Rs.180\n 3.Chicken 65 ---- Rs.90\n");
				int menuAnj = sc.nextInt();
				switch (menuAnj) {
					case 1: {
						System.out.println("Mutton Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 240 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}
					// 41
					case 2: {
						System.out.println("Chicken Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 180 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");// 61
						}
						break;
					}

					case 3: {
						System.out.println("Prawn Biriyani");
						System.out.println("Enter Quantity: ");
						int quan = sc.nextInt();
						int bill = 90 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								int generateOtp = (int) (Math.random() * 9000) + 1000;
								System.out.println(generateOtp);
								System.out.print("Enter OTP ");
								int otp = sc.nextInt();
								System.out.println("Processing...");
								Thread.sleep(1000);
								if (generateOtp == otp) {
									System.out.println("Order placed..!");
								} else {
									System.out.println("Invalid OTP");
								}
							} else {
								System.out.println("Order failed!!");
							}
						} else {
							System.out.println("Order Cancelled!");
						}
						break;
					}
					default:
						System.out.println("Invalid");

				}

			}
			default:
				System.out.println("Select a valid option for Restaurant");

		}
	}

}
