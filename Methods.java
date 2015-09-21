import java.util.Scanner;

public class Methods{
	
	public static void sayMyName(){
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.nextLine();

		System.out.println("Your name is " + name);
	}
	public static void sayMyAge(){
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old." );
	}

	public static void addTwoNumbers(){
		int num1, num2, sum;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number?");
		num1 = input.nextInt();

		System.out.println("Enter the second number?");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.println("The sum of two numbers ="  +  sum );
	}

	public static void multiplyTwoNumbers(){
		int num1, num2, mult;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number?");
		num1 = input.nextInt();

		System.out.println("Enter the second number?");
		num2 = input.nextInt();
		mult = num1 * num2;
		System.out.println("The product of two numbers ="  +  mult );
	}

	public static void add(int a, int b){
		int sum = a + b;
		System.out.println( "The sum is = " + sum);
	}
	
	public static void eligibleToVote(){
		Scanner input = new Scanner(System.in);

		String name = "Nigerian";
		int age;
		System.out.println("What is your nationality?");
		name = input.nextLine();
		
		if (name == "Nigerian" ){
			System.out.println("Proceed to next question");
			System.out.println("How old are you");
			age = input.nextInt();
		}

		else if(name != "Nigerian"){
			System.out.println("Not eligible");
			
		}	
	}
		


	public static void main(String args[]){
		//sayMyName();
		//sayMyAge();
		//addTwoNumbers();
		//multiplyTwoNumbers();
		//add( Scanner input = new Scanner(System.in);
		 eligibleToVote();

	}
}	