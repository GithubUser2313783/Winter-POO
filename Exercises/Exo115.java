package Exercises;

import java.util.Scanner;

public class Exo115 {
    public static void main(String[] args) {
        try{
            System.out.println("Name :" + args[0] + "Other name :" + args[1]);
            }
        catch(ArrayIndexOutOfBoundsException a){
        System.out.print("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : ");
        try (Scanner scanny = new Scanner(System.in)) {
            String prenom = scanny.next();
            String nom = scanny.next();
            System.out.println("Name :" + prenom + " Other name :" + nom);
            }
        }
    }
}
