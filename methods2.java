import java.util.Scanner;

public class methods2{

	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i< 5; i++){
			sum = a[i] + sum;
		}

		System.out.println("The sum is " + sum);

		String[][] names ={
			{"Mr.", "Mrs.", "Ms."},
			{"Smith", "Jones"}
		};
		/*
		for(int i = 0; i < names[0].length; i++){
			for(int j = 0; j < names[i].length; j++){
			System.out.println(names[i][j] + names[1][j]);	
			}
		}
		*/
		
	} 





	public static void name(String[] args){
		//String name1 = getFirstname();
		//String name2 = getMiddlename();
		System.out.println("My name is " + getFirstname() + " " + getMiddlename() + "." );
	}

	public static String getFirstname(){
		return "Mary";
	}

	public static String getMiddlename(){
		return "Dzifa";
	}

	
	
	public static void sayMyName(String fullname){
		//System.out.println( "Your name is " + fullname);
		sayMyName(fullname, "", "");	
	}


	public static void sayMyName(String firstname, String surname){

		System.out.println( "Your name is " + firstname + " " + surname);
	}

	public static void sayMyName(String firstname, String middlename, String lastname){

		System.out.println("Your name is " + firstname +" " + middlename + " " + lastname);
	}


}