import java.util.Scanner;

public class Calculator {

	public static void main(String [] args)
	{
		//give a welcome message.
		System.out.println ("Welcome to Calculator" );
		System.out.println ("Please select the mathematical operation you want to perform;");
		System.out.println ("1. Addition" );
		System.out.println ("2. Subtraction" );
		System.out.println ("3. Multiplication" );
		System.out.println ("4. Division" );
		System.out.println ("5. Square root ");
		System.out.println ("6. Modulus" );
		System.out.println ("7. Average");
		System.out.println ("8. Exponent");


		Scanner input = new Scanner(System.in);
		int option = input.nextInt();

		if (option == 1 ){
			System.out.println("You have opted for an addition");
			System.out.println("Enter the first number");
			double a = input.nextDouble();

			System.out.println("Enter the second number");
			double b = input.nextDouble();

			add(a, b);
			
		}
		else if (option ==2){
			System.out.println("You have opted for a Subtraction");
			System.out.println("Enter the first number");
			double a = input.nextDouble();

			System.out.println("Enter the second number");
			double b = input.nextDouble();

			subtract(a, b);

		}
		else if (option == 3){
		System.out.println("You have opted for a multiplication");
			System.out.println("Enter the first number");
			double a = input.nextDouble();

			System.out.println("Enter the second number");
			double b = input.nextDouble();

			multiply(a, b);
		}

		else if (option == 4){
			System.out.println("You have opted for a division");
			System.out.println("Enter the first number");
			double a = input.nextDouble();

			System.out.println("Enter the second number");
			double b = input.nextDouble();

			divide(a, b);
		}

		else if (option == 5){
			System.out.println("You have opted for a squareroot");
			System.out.println("Enter the number");
			double a = input.nextDouble();

			squareRoot(a);
		}
		else if(option == 6){
		System.out.println("You have opted for a modulus");
			System.out.println("Enter the first number");
			double a = input.nextDouble();

			System.out.println("Enter the second number");
			double b = input.nextDouble();

			modulus(a, b);
		}
		else if (option == 7){
			System.out.println("You have opted for an average");
			System.out.println("Enter the first number");
 			
 			int a = input.nextInt();
 
      		System.out.println("Enter the second number");
      		int b = input.nextInt();

      		average(a,b);
        }

        else if (option == 8){
        	System.out.println("You have opted for exponent");
        	System.out.println("Enter the first number");
        	double a = input. nextDouble();

        	System.out.println("Enter the second number");
        	double b = input. nextDouble();

        	power(a,b);
        }
 	}

	public static void add(double a, double b){
		double sum = a + b;
		System.out.println ("The sum of the two numbers is = " + sum );

	}
	public static void subtract(double a, double b){
		double minus = a - b;
		System.out.println ("The difference of the two numbers is = " + minus );

	}
	public static void multiply(double a, double b){
		double multi = a * b;
		System.out.println ("The multiplication of the two numbers is = " + multi );

	}
	public static void divide(double a, double b){
		double div = a / b;
		System.out.println ("The division of the two numbers is = " + div );

	}

	public static void squareRoot(double a){
				boolean isAPositiveNumber = true;
	        	double digit;
	 
	        if(a ==0)
	        {
	            System.out.println("Square root of "+ a  +" = "+0);
	        }
	 
	        else if(a<0)
	        {
	            a=-a;
	            isAPositiveNumber = false;
	        }
	 
	        double squareRoot = a/2;
	        do
	        {
	            digit=squareRoot;
	            squareRoot = (digit + (a/digit))/2;
	        }
	        while((digit-squareRoot)!=0);
	 
	        if(isAPositiveNumber)
	        {
	            System.out.println("Square roots of "+a+" are ");
	            System.out.println("+"+ squareRoot);
	            System.out.println("-"+ squareRoot);
	        }
	        else
	        {
	            System.out.println("Square roots of -"+a+" are ");
	            System.out.println("+"+ squareRoot);
	            System.out.println("-"+ squareRoot);
	        }
			

	}
	public static void modulus(double a, double b){
		double mod = a % b;
		System.out.println ("The modulus of the two numbers is = " + mod );

	}

	public static void average(int a, int b){
		int avg = a +(b-a)/2;
		System.out.println("The average of two numbers is =" + avg);
	 
  	}

  	public static void power(double a , double b){
		double result = 1;
		for(int i = 0 ; i< b ; i++){
		result *= a;
		}
		System.out.println ("The exponent of the numbers is " + result);
	}
     
}	

	