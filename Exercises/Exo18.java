public class Exo18{
	public static void main(String[] args) {
		
		int[] table = new int[10000];
		
		for(int i = 0; i < table.length; i++){
			table[i] = (int) Math.random() * 11};
		}	
		int[] occurences = new int[11];
		
		for(int i = 0; i < table.length; i++){
			occurences[table[i]]++;
		}
		for (int i = 0; i < occurences.length; i++){
			System.out.printf(format:"%d : %d")
		}	
/*		
		int nbZero = 0;
		int nbOne = 0;
		int nbTwo = 0;
		int nbThree = 0;
		int nbFour = 0;
		int nbFive = 0;
		int nbSix = 0;
		int nbSeven = 0;
		int nbEight = 0;
		int nbNine = 0;
		int nbTen = 0;
		
		for(int i = 0; i < table.length; i++){
			if(table[i] == 0){
				nbZero++;
			if(table[i] == 1){
				nbOne++;
			if(table[i] == 2){
				nbTwo++;	
			if(table[i] == 3){
				nbThree++;
			if(table[i] == 4){
				nbFour++;
			if(table[i] == 5){
				nbFive++;
			if(table[i] == 6){
				nbSix++;
			if(table[i] == 7){
				nbSeven++;
			if(table[i] == 8){
				nbEight++;
			if(table[i] == 9){
				nbNine++;
			if(table[i] == 10){
				nbTen++;
			}
		}
		*/
	}
}