import java.util.*;
public class Atm{
	public static void main(String[] args){
		System.out.println("ATM");
		

		Scanner sc=new Scanner(System.in);
		int opt;
		int balance=1000;
		do{
		System.out.println("1.Display\n 2.Deposit\n 3.Withdrawal\n 4.Exit\n");
		System.out.println("Select an option:");
		opt=sc.nextInt();
		
		switch(opt){
			case 1:{
				System.out.println("Current Balance : "+balance);
				
				break;
				}

			case 2:{
				System.out.println("Deposit");
				int deposit=sc.nextInt();
				balance+=deposit;
				System.out.println("Current Balance:"+balance);
				break;
				}
			case 3:{
				System.out.println("Withdrawal");
				int withdrawal=sc.nextInt();
				if(withdrawal<=balance){
					balance=balance-withdrawal;
					System.out.println("withdrawal done, Your current balance is "+balance);
				}
				else{
				System.out.println("Insufficient balance!");				
				}
				break;
				}
			case 4:{
				System.out.println("Exiting");
				break;
				}
			default:{
				System.out.println("Invalid option");
				break;
			}

		}
		}while(opt!=4);

	}

}