public class Exo10 {
    public static void main(String[] args) {
        int[] table = new int[5];
    
        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 101);
        }
    
        int min = table[0];
        int max = table[0];
        
        System.out.print("[");
        for(int i = 0; i < table.length-1; i++){
            System.out.print(table[i] + ",");
            if(min > table[i]){
                min = table[i];
            }
            if(max < table[i]){
                max = table[i];
            }
        }
        System.out.print(table[table.length-1]);
        System.out.println("]");
        
        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);
    }
}