package blinmaker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int eggsAmount;
		int eggsMin = 1;
		int milkAmount;
		int milkMin = 200; //milliliters
		int flourAmount;
		int flourMin= 100; //grams
		 
		System.out.println("Hello user");
		System.out.println("Blin Calculator starting up...");
		System.out.println("How many eggs do you have?");
		
		Scanner userInput;
		userInput = new Scanner(System.in);
		eggsAmount = userInput.nextInt();
		System.out.println("You have " + eggsAmount + " eggs");
		//eggs done
		
		System.out.println("How much flour do you have?");
		userInput = new Scanner(System.in);
		flourAmount = userInput.nextInt();
		System.out.println("You have " + flourAmount + " grams flour");
		//flour done
	
		System.out.println("How much milk do you have?");
		userInput = new Scanner(System.in);
		milkAmount = userInput.nextInt();
		System.out.println("You have " + milkAmount + " ml of milk");
		//milk done
		
		//main code here
		if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
			System.out.println("no blin today :(");
		} else {
			//calculation
			flourAmount = flourAmount / flourMin;
			System.out.println("you have " + flourAmount + " portions of flour");
			
			milkAmount = milkAmount / milkMin;
			System.out.println("you have " + milkAmount + " portions of milk");
			
			//find smallest amount of all 3
			int smallest;
			if (eggsAmount <= milkAmount && milkAmount <= flourAmount) {
				smallest = eggsAmount;
			} else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
				smallest = milkAmount;
			} else {
				smallest = flourAmount;
			}
			System.out.println(" "); //every portion is 4 blins
			System.out.println("you can make " + smallest*4 + " eggs");
			System.out.println(" ");
			System.out.println("you will need " + smallest*eggsMin + " eggs");
			System.out.println("you will need " + smallest*milkMin + " milk");
			System.out.println("you will need " + smallest*flourMin + " flour");
			System.out.println(" ");
			System.out.println("Blinmaker shutting down");
		}
		
	}

}
