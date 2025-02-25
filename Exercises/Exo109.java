public class Exo109 {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(12345, "John");
        etudiant1.evaluations[0].noteSur100 = 50;
        etudiant1.evaluations[1].noteSur100 = 70;
        etudiant1.evaluations[2].noteSur100 = 100;
    }
}
class Etudiant {
    int da;
    String nomComplet;
    Evaluation[] evaluations = {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.4f),
        new Evaluation("Examen Final", 0.6f),
    };
    public Etudiant(int da, String nomComplet){
        this.da = da;
        this.nomComplet = nomComplet;
    }

    public byte noteFinal(){
        byte noteFinale = 0;
        for(int i = 0 ; i < this.evaluations.length ; i++){
            noteFinale += this.evaluations[i].notePonderee();
        }
        return noteFinale;
    }

    public void afficheResultat(){
        System.out.println(this.da + " " + this.nomComplet + " ");
        for(int i = 0 ; i < this.evaluations.length ; i++){
            System.out.println(this.evaluations[i].notePonderee() + " ");
        }
        System.out.println("| " + this.noteFinal());
    }
}

class Evaluation{
    String nom;
    float ponderation;
    byte noteSur100;

    public Evaluation(String nom, float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee(){
        return (byte) (this.noteSur100 * this.ponderation);
    }
    public void afficheEvaluation(){
        System.out.println(this.nom + " " + this.ponderation + " " + this.notePonderee());
    }
}