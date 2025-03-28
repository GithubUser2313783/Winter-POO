package Exercises;

import java.util.Scanner;

public class ExoScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter operator name: ");
		String name = scanner.next();
		
		System.out.println(name);
	}
}