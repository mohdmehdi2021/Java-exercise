/*

Theme : Squirrel Party (Cigar Party)
Author : Mohd Mehdi
Date : 07/12/2021

When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true

Source of Question : codingbat.com

*/

import java.util.Scanner;
import java.util.InputMismatchException;

class CigarParty{
	public static void main(String[] args){
		Scanner scanCP = new Scanner(System.in);
		
		System.out.println("\n\n\t\t\tSquirrel Party ( Cigar Party )");
		System.out.println("\t\t\tDeveloper : Mohd Mehdi s/o Arshad Abbas Khan\n");

		try{
		System.out.println("Enter number of Cigar taken : ");
		int numberOfCigar = scanCP.nextInt();
		
		if(numberOfCigar >= 40 && numberOfCigar <= 60){
		   System.out.println("Is it WeekEnd : (Y/n)");
		   String weekEnd = scanCP.next();

		   if(weekEnd.equals("Y")){
			System.out.println("\nParty gone successful\n");
		   }
 		   else if(weekEnd.equals("n")){
			System.out.println("\nParty gone successful\n");
		   }
		}
		else if(numberOfCigar < 40){
			System.out.println("\nParty didn't gone well\n");
		}
		else if(numberOfCigar > 60){
			System.out.println("Is it WeekEnd : (Y/n)");
		   	String weekEnd = scanCP.next();

			if(weekEnd.equals("Y")){
			System.out.println("\nParty gone successful\n");
		   	}
		   	else if(weekEnd.equals("n")){
			System.out.println("\nDo not smoke more\n");
		   	}
		}
		else{
			System.out.println("Enter VALID input");
		      }
		}catch(InputMismatchException e){
			System.out.println("\n\nEnter VALID input\n\n");
		}
	}
}