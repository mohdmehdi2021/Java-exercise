/*

Author : Mohd Mehdi
Date : 08/12/2021 18:58

Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
Hindi Translation :- agar diya gya number 20 ke multiples se 1 ya do number zyada hai, to 'true' print karo.

more20(20) → false
more20(21) → true
more20(22) → true

*/

import java.util.Scanner;

class Problem5{
	public static void main(String[] args){
		System.out.println("\n\n\t\tAuthor : Mohd Mehdi s/o Arshad Abbas Khan\n\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check whether it is 1 or 2 more than multiples of 20.");
		int number = scan.nextInt();

		int numberMoreThanTwenty = more20(number);
		
		if(numberMoreThanTwenty == 1 || numberMoreThanTwenty == 2){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
 
	}
	
	public static int more20(int num){

		int mod = num%10;
		return mod;

	}
}