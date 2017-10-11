package howOldAreYou;

import java.util.Scanner;

public class MainClass
{
	static Scanner input = new Scanner(System.in);
	static boolean isPlaying = false;
	
	public static void main(String[] args)
	{
		String userName;
		
		int Age;
		
		
		System.out.println("What is your name?");
		
		userName = input.nextLine();
		
		System.out.println("Hello " +userName);
		System.out.println("How old are you?");
		
		Age = input.nextInt();
		if(Age < 16)
		{
			System.out.println("You cant drive!");
		}
		if(Age < 18)
		{
			System.out.println("You are to young to vote!");
		}
		if(Age < 25)
		{
			System.out.println("You cant rent a car!");
		}
		if(Age >= 25)
		{
			System.out.println("You are able to do anything legal!");
		}
	}
}
