/*
Author : Mohd Mehdi
Date : 07/12/2021

Q1 - You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

Website (Source of Question) = codingbat.com

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0

*/


import java.util.Scanner;
import java.util.InputMismatchException;

class Intro{
	public static void main(String[] args){
		System.out.println("\n\n\t\tTraffic Police Assistant App");
		System.out.println("\n\t\tDeveloper : Mohd Mehdi s/o Arshad Abbas Khan");

		try{
		Scanner scanInput = new Scanner(System.in);

		System.out.println("Enter Speed in kmph");
		int speed = scanInput.nextInt();

		System.out.println("Is today your Birthday : (Y/n)");
		String birthDay = scanInput.next();

		if(speed <= 60 && birthDay.equals("Y")){
			System.out.println("Ticket : 0");
		}
		else if(speed <= 60 && birthDay.equals("n")){
			System.out.println("Ticket : 0");
		}
		else if(speed > 60 && speed <=80 && birthDay.equals("Y")){
			if(speed <= 65){
			System.out.println("Ticket : 0");
			}
		}

		else if(speed > 60 && speed <=80 && birthDay.equals("n")){
			System.out.println("Ticket : 1");
		}
		else if(speed > 80 && birthDay.equals("Y")){
			if(speed <= 85){
			System.out.println("Ticket : 0");
			}
			else{
			System.out.println("Ticket : 2");
			}}
		else if(speed > 80 && birthDay.equals("n")){
			System.out.println("Ticket : 2");
			}
		}
		catch(InputMismatchException e){
			System.out.println("\nEnter VALID input.\n");
		}


	}
}