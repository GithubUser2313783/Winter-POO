package Exercises;

import java.util.ArrayList;

public class ExoList {
    public static void main(String[] args) {
        // Création d'une ArrayList
        ArrayList<String> liste = new ArrayList<>();
        
        // Ajout d'éléments
        liste.add("Java");
        liste.add("Python");
        liste.add("C++");
        
        // Accès aux éléments
        System.out.println(liste.get(0));  // Affiche "Java"
        
        // Modification d'un élément
        liste.set(1, "JavaScript");
        
        // Suppression d'un élément
        liste.remove(2);
        
        // Affichage de la liste
        System.out.println(liste);
    }
}