public class Exo8 {
    public static void main(String[] args) {
        int[] table = new int[5];

        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 101);
        }

        System.out.print("[");
        for(int i = 0; i < table.length-1; i++){
            System.out.print(table[i] + ",");
        }
        System.out.print(table[table.length-1]);

        System.out.println("]");
        
    }
}