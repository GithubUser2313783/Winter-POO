package Exercises;

import java.util.ArrayList; 
import java.util.Scanner; 
 
public class Exo50 { 
    public static void main(String[] args) { 
        // DA LIST
        ArrayList<String> numbers = new ArrayList<>(); 
        numbers.add("1"); 
        numbers.add("2"); 
        numbers.add("3"); 
        numbers.add("4");
		numbers.add("5");
 
        // SHOW DA LIST
        System.out.println("DER NUMBERS:"); 
        for (int i = 0; i < numbers.size(); i++) { 
            System.out.println(i + ": " + numbers.get(i)); // SHOW DA NUMBAS
        } 
 
        // GIVE DA USA POWA
        Scanner scanner = new Scanner(System.in); 
        System.out.print("CHOOSE NUMBA TO KILL: "); 
        int removeNumber = scanner.nextInt(); 
 
        // DESTROY NUMBA FROM USA PROMPTA
        if (removeNumber >= 0 && removeNumber < numbers.size()) { 
            String removedNumber = numbers.remove(removeNumber); 
            System.out.println("YOU KILLED: " + removedNumber); 
        } else { 
            System.out.println("YOU CAN NOT DO THAT."); 
        } 
 
        // SHOW NEW LIST 
        System.out.println("DER NEW NUMBERS:"); 
        for (String number : numbers) { 
            System.out.println(number); 
        } 
 
        // SCANNER GO BYE BYE
        scanner.close(); 
    } 
} 