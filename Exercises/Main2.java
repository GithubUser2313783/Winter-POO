package Exercises;

public class Main2 {
    public static void main(String[] args) {
        Personne john = new Personne((byte)100, 1.80f, "John Doe", 200);
        System.out.println(john.getAge());
        john.setAge((byte)120);
        System.out.println(john.getAge());
    }
}