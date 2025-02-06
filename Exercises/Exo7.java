public class Exo7 {
    public static void main(String[] args) {
        int[] table = new int[5];

        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 101);
        }

        for (int i : table) {
            System.out.println(i);
        }
    }
}