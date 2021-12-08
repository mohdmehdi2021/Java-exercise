/*

Theme : Love6
Author : Mohd Mehdi
Date : 08/12/2021

Source of Question : codingbat.com

Question =>
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true

*/
import java.util.Scanner;
class Love6{
	public static void main(String[] args){

		System.out.println(" Love 6 ");
		System.out.println(" Developer : Mohd Mehdi ");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int firstNum = scan.nextInt();
 	
		System.out.print("Enter Second Number : ");
		int secondNum = scan.nextInt();

		int sum = add(firstNum,secondNum);
		int diff = difference(firstNum,secondNum);

		if(sum == 6 || firstNum == 6 || secondNum == 6 || diff == 6){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

	public static int add(int fnum,int snum){
		return fnum + snum;
	}

	public static int difference(int fnum,int snum){
		return fnum - snum;
	}
}