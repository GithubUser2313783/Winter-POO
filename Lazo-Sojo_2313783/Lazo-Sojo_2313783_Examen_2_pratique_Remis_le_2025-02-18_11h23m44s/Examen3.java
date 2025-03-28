/* Question 3 */

public class Examen3 { 
    public static void main(String[] args) {
        int[] table = new int[10];
        for( int i = 0; i < table.length ; i++){
            table[i] = (int)(Math.random() * 101);
        }
        //Retire ça -0.5
        // System.out.print("[");
        showBoard(table);
        int indexMin;
        int memory;
        for( int i = 0; i < table.length ; i++){
            indexMin = i;
            for(int j = i + 1; j < table.length; j++){
                if(table[j] < table[indexMin]){
                    indexMin = j;
                }
            }
            memory = table[indexMin];
            table[indexMin] = table[i];
            table[i] = memory;
            
        }
		showBoard(table);
    }
    public static void showBoard(int[] table){
		System.out.print("[");
        for( int i = 0; i < table.length - 1 ; i++){
            System.out.print(table[i] + ", ");
        }
        System.out.println( table[table.length - 1] + "]");
    }
}