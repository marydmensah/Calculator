import java.util.Scanner;

public class FigureInWords{

	static String[] units = {"Zero","One","Two","Three","Four",
	"Five","Six","Seven","Eight","Nine","Ten",
	"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
	"Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
	"Sixty","Seventy","Eighty","Ninety"};


	public static String convert(int fig){
		String store ="";
		boolean isNegative = false;

		if(fig < 0){ 
		isNegative = true;
		 fig = Math.abs(fig);
		}

		if( fig < 20)  store = units[fig];

		if (fig >= 20 && fig < 100) {
            if (fig % 10 > 0) {
                store = tens[fig / 10] + " " + convert(fig % 10);
            } else {
                store = tens[fig / 10];
            }
        }

        if (fig >= 100 && fig < 1000) {
            if (fig % 100 > 0) {
                store = convert(fig / 100) + " Hundred and " + convert(fig % 100);
            } else {
                store = convert(fig / 100) + " Hundred";
            }
        }
        if (fig >= 1000 && fig < 1000000) {
            if (fig % 1000 > 0) {
                store = convert(fig / 1000) + " Thousand " + convert(fig % 1000);
            } else {
                store = convert(fig / 1000) + " Thousand";
            }
        }
        if (fig >= 1000000 && fig <= 1000000000) {
            if (fig % 1000000 > 0) {
                store = convert(fig / 1000000) + " Million " + convert(fig % 1000000);
            } else {
                store = convert(fig / 1000000) + " Million";
            }
        }
        if (fig > 1000000000) {
            if (fig % 1000000000 > 0) {
                store = convert(fig / 1000000000) + " Billion " + convert(fig % 1000000000);
            } else {
                store = convert(fig / 1000000000) + " Billion";
            }
        }
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