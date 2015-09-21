import java.util.Scanner;

public class FigureInWords{

	static String[] units = {"Zero","One","Two","Three","Four",
	"Five","Six","Seven","Eight","Nine","Ten",
	"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
	"Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
	"Sixty","Seventy","Eighty","Ninety"};


	public static String convert(int i){
		String store ="";
		boolean isNegative = false;

		if(i < 0){ 
		isNegative = true;
		 i = Math.abs(i);
		}

		if( i < 20)  store = units[i];

		if( i>= 20 && i < 100 ) 
			store= tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");

		if( i>= 100 && i < 1000) 
			store= units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");

		if( i>=1000 && i < 1000000) 
			store= convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;

		if(i >= 1000000 && i < 1000000000) 
			store = convert(i / 1000000) + " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;

		if(i >= 1000000000) 
			store = convert(i / 1000000000) + " Billion " + ((i % 1000000000 > 0)? " " + convert(i % 1000000000):"") ;

		if (isNegative){
			return "Negative " + store;
		}else{
			return store;
		}
	}
		

	public static void main(String[] args){
		String response = "";

		try{
			do{
			System.out.print("Enter the number to convert to words (or 'done' to quit) ");
			Scanner input =  new Scanner(System.in);
			response = input.nextLine();


			int a = Integer.parseInt(response);
			String b = convert(a);
			System.out.println( b );
		}while(response != "done");
	}
		catch(NumberFormatException e){
			try{
				if(Float.parseFloat(response) >= 0.0){
					System.out.println("You have entered a wrong value.");
				}
			}
			catch(NumberFormatException g){
				System.out.println("Thank you for using our service.");
			}

		}
	}

}