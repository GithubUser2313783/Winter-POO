/* Question 1 */

public class Tableau { 
    public static void main(String[] args) {
        //-4 utilisation d'args
        int[] table = new int[8];
        for( int i = 0; i < table.length ; i++){
            table[i] = (int)(Math.random() * 101);
        }
        //Mets cette ligne dans showBoard
        System.out.print("[");
        showBoard(table);


        //Retire le code inutile! -2
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
    }
    public static void showBoard(int[] table){
        for( int i = 0; i < table.length - 1 ; i++){
            System.out.print(table[i] + ", ");
        }
        System.out.println( table[table.length - 1] + "]");
    }
}