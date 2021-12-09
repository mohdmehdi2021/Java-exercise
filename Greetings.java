/*

Author : Mohd Mehdi
Date : December 9, 2021 18:00
Source of Question : codingbat.com

Question=>
	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"

*/

import java.util.Scanner;

class Greetings{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, Name please!");
		String name = sc.nextLine();
		
		String hName = helloName(name);
		System.out.println(hName);
		
		
		
	}

	public static String helloName(String name){
			
		return "\"Hello " + name + "!\"";
	}

}		