package Exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Exo010 {
    public static void main(String[] args) {
        Random random = new Random(1);
        Groupe groupe1 = new Groupe(
            Arrays.asList(
                new Etudiant(1832491, "Alice"),
                new Etudiant(2468103, "Bob"),
                new Etudiant(3726145, "Charlie"),
                new Etudiant(4859021, "David"),
                new Etudiant(5983472, "Eve"),
                new Etudiant(6129048, "Frank"),
                new Etudiant(7235146, "Grace"),
                new Etudiant(8376012, "Hannah"),
                new Etudiant(9453023, "Isaac"),
                new Etudiant(1023485, "Jack"),
                new Etudiant(2135749, "Karen"),
                new Etudiant(3201854, "Louis"),
                new Etudiant(4337602, "Mona"),
                new Etudiant(5498321, "Nathan"),
                new Etudiant(6571984, "Olivia"),
                new Etudiant(7612493, "Paul"),
                new Etudiant(8793461, "Quincy"),
                new Etudiant(9834527, "Rachel"),
                new Etudiant(1056743, "Sam"),
                new Etudiant(2187630, "Tina"),
                new Etudiant(3265984, "Ursula"),
                new Etudiant(4306715, "Victor"),
                new Etudiant(5394120, "Wendy"),
                new Etudiant(6412309, "Xander"),
                new Etudiant(7523018, "Yara"),
                new Etudiant(8654092, "Zane"),
                new Etudiant(9735084, "Amy"),
                new Etudiant(1087416, "Ben"),
                new Etudiant(2158367, "Clara"),
                new Etudiant(3267419, "Daniel")
            )
        );
        for(int i = 0; i < groupe1.etudiants.size() ; i++){
            for(int j = 0 ; j < groupe1.etudiants.get(i).evaluations.length ; j++){
                groupe1.etudiants.get(i).evaluations[j].noteSur100 = (byte) (random.nextInt(71) + 30);
            }
        }
        groupe1.afficheResultats();
        System.out.println();
        groupe1.trierParNote();
        groupe1.afficheResultats();
        
    }   
}
class Groupe{
    String nomCours;
    ArrayList<Etudiant> etudiants = new ArrayList<>();
    public Groupe(List<Etudiant> etudiants){
        this.etudiants.addAll(etudiants);
    }

    public byte moyenneGenerale(){
        int somme = 0;
        for(int i = 0 ; i < etudiants.size() ; i++){
            somme += etudiants.get(i).noteFinale();
        }
        return (byte) (somme/etudiants.size());
    }
    public void afficheResultats() {
        for(int i = 0; i < this.etudiants.size() ; i++){
            this.etudiants.get(i).afficheResultat();
        }
    }
    public void trierParNote(){
        Collections.sort(this.etudiants,(etudiant1,etudiant2) -> -1 * Byte.compare(etudiant1.noteFinale(),etudiant2.noteFinale()));
    }
}


class Etudiant{
    int da;
    String nomComplet;
    String courriel;
    Evaluation[] evaluations = {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.3f),
        new Evaluation("Examen Final", 0.5f),
    };
    
    public Etudiant(int da, String nomComplet){
        this.da = da;
        this.nomComplet = nomComplet;
    }
    public byte noteFinale(){
        byte note = 0;
        for(int i = 0; i < evaluations.length ; i++){
            note += this.evaluations[i].notePonderee();
        }
        return note;
    }
    public void afficheResultat(){
        String msg = this.da + " " + this.nomComplet + " ".repeat(10 - this.nomComplet.length());
        for(int i = 0 ; i < this.evaluations.length ; i++){
            String note = String.format("%d",this.evaluations[i].notePonderee());
            msg +=  note + (note.length() < 2 ? "  " : " "); 
        }
        msg += "| " + this.noteFinale();
        System.out.println(msg);

    }
}

class Evaluation{
    String nom;
    float ponderation;
    byte noteSur100 = 0;

    public Evaluation(String nom,float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }
    public byte notePonderee(){
        return (byte) (this.ponderation * this.noteSur100);
    }

    
}