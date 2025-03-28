package Exercises;


public class Exo6 {
    public static void main(String args[]){
        boolean answer;
        answer = 44 == 66;
        System.out.println(answer);

        answer = 44 != 66;
        System.out.println(answer);

        answer = 44 > 66;
        System.out.println(answer);

        answer = 44 <= 66;
        System.out.println(answer);

        boolean isHealthy = true;
        boolean isCool = false;

        System.out.println(isHealthy & isCool);

        System.out.println(!isHealthy & isCool);



        System.out.println(isHealthy | isCool);

    }
}