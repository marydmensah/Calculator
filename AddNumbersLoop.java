import java.util.Scanner;

public class AddNumbersLoop{
	public static void main(String args[])
	{
		//int counter = 1, numEntered, result =0;
		int numEntered, result =0;
		Scanner input = new Scanner(System.in);
		// input or in
		//while (counter <= 3){

		for (int counter = 1; counter <= 10; counter ++){
			System.out.println("Enter number" + counter);
			numEntered = input.nextInt();
			//numEntered = Integer.parseInt(in.nextLIne());
			result += numEntered;

			//counter ++;

			}
			System.out.println("Sum of entered integers =" + result);

	}
}