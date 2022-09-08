package com.drink.obj;
import java.util.*;

public class YourDrink {
	private static final String cold = null;
	String name,s1;
	int age,choice;
	

	public YourDrink() {
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Please Enter your name?");
        Scanner scan= new Scanner(System.in);
        String name = scan.nextLine();   
        System.out.println("Name: " + name);  
		System.out.println("Please Enter your age");
		int age=scan.nextInt();
		System.out.println("Age: " + age); 
		
		System.out.println("Your current mood (elated,excited,tired,bored,sad,sleepy,hungry)");
		String drink= scan.nextLine();
		System.out.println("Your specifications are:" + drink);
		
		System.out.println("Please enter choices you would like in your drink"
				+ "1. Softdrink\n "
				+ "2. Cold-drink\n "
				+ "3. Milkshake\n"
				+ "4. Chillers\n"
				+ "5. Energy drink\n "
				+ "6. Fruitjuice\n "
				+ "7. Coffee,Tea");
		System.out.println("Please Tell us which drink you prefer!");
		int choice=scan.nextInt();

		
		
        
           
	}

}
