import java.util.Scanner;

public class AtmCase1{
	public static void main(String args[])
	{
		int pin,trans,amount;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your pin");
		pin = input.nextInt();

		System.out.println("Type of transaction");
		
		System.out.println("1. Balance Enquiry");
		System.out.println("2. Cash WIthdrawal");
		trans = input.nextInt();

		if(trans == 1){
			System.out.println("Your balance is 200cedis");
		}

		else if (trans==2){
			System.out.println("How much do you want to withdraw");
		amount = input.nextInt();
		System.out.println("Please take your money");
		}
	}

}