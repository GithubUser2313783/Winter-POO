package Exercises;

public class Exo17{
	public static void main(String[] args){	
		char[] characters = {'a', 'b', 'e', 'i', 'f', 'o', 'p', 'u', 'y'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		int nbVowels = 0;
        for(int i = 0 ; i < characters.length ; i++){
            for( int j = 0 ; j < vowels.length ; j++){
                if(characters[i] == vowels[j]){
                    nbVowels += 1;
                    break;
				}
			}
		}
		
		System.out.printf("There are " + nbVowels + " vowels in this table.");
		
	}
}