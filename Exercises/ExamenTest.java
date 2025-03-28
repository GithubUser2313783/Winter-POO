package Exercises;

public class ExamenTest {
    public static void main(String[] args) {
        Examen firstexam = new Examen("John", (byte) 100);
        firstexam.afficheResultat();
    }
}
class Examen{
    String nomEtudiant;
    byte note;

    public Examen(String nomEtudiant, byte note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }
    public void afficheResultat(){
        System.out.println(this.nomEtudiant + " : " + this.convertNote());
    }
    public char convertNote(){
        char lettre = 'N';

        if(this.note <=100 && this.note >90){
            lettre = 'A';
        }
        if(this.note <=90 && this.note >80){
            lettre = 'B';
        }
        if(this.note <=80 && this.note >70){
            lettre = 'C';
        }
        if(this.note <=70 && this.note >60){
            lettre = 'D';
        }
        if(this.note <=60 && this.note >0){
            lettre = 'F';
        }
        return lettre;
    }
}

