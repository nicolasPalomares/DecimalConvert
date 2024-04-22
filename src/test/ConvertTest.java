package test;

import java.util.Scanner;

import conversor.Conversor;

public class ConvertTest {
	
	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the decimal number you want to convert");
		int number = sc.nextInt();
		
		System.out.println("Select an option");
		System.out.println("1. Convert to binary");
		System.out.println("2. Convert to hexadecimal");
		System.out.println("3. Exit");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			conversor.printBinary(number);
			break;
		case 2:
			conversor.printHexadecimal(number);
			break;
		case 3:
			System.exit(0);
			sc.close();
		}
		
		System.exit(0);
		sc.close();
		
	}

}
