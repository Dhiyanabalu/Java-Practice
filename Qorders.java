import java.util.*;

public class Qorders {
	public static void main(String[] args) {
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
						"Mutton biriyani ---- Rs.220\nChicken Biriyani ---- Rs.180\nPrawn Biriyani ---- Rs.180\n");
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
								System.out.println("Order placed..!");// 30
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
								System.out.println("Order placed..!");
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
						int bill = 180 * quan;
						System.out.println("Your bill is " + bill + ".Rs");
						System.out.println("Do you want to place order? \t if Yes Enter 'y' else 'n' \t");
						char ch = sc.next().charAt(0);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter Your Bill amount on your order: ");
							int billamt = sc.nextInt();
							if (billamt == bill) {
								System.out.println("Order placed..!");
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
				System.out.println("Gobi Rice ---- Rs.100\nMeals ---- Rs.150\nVeg Biriyani ---- Rs.120\n");
				break;
			}
			case 3: {
				System.out.println("Welcome to Anjappar Restaurant\n");
				System.out.println("Select your favourite Dish to order");
				System.out
						.println("Mutton biriyani ---- Rs.220\nChicken Biriyani ---- Rs.180\n Chicken 65 ---- Rs.90\n");
				break;
			}
			default:
				System.out.println("Select a valid option for Restaurant");

		}
	}

}
