package Exercises;


public class Main {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule("Toyota",2022);
        Voiture voiture = new Voiture("Toyota", 2022);
        
        vehicule.afficherInfo();

        voiture.afficherInfoVoiture();
        
    
    }
}
class Vehicule {
    private String marque = "Default";
    private int annee = 0;

    public Vehicule(String marque, int annee){
        this.setMarque(marque);
        this.setAnnee(annee);
    }


    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getMarque(){
        return this.marque;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    public int getAnnee(){
        return this.annee;
    }

    public void afficherInfo() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }
}



class Voiture extends Vehicule {
    private int nombreDePortes = 4;

    public Voiture(String marque, int annee){
        super(marque, annee);
    }

    public void setNombreDePortes(int nombreDePortes){
        this.nombreDePortes = nombreDePortes;
    }

    public int getNombreDePortes(){
        return this.nombreDePortes;
    }


    public void afficherInfoVoiture() {
        System.out.println("\n\n######################");
        super.afficherInfo(); // Appel de la méthode de la superclasse
        System.out.println("Nombre de portes: " + nombreDePortes);
        System.out.println("######################\n\n");
    }
}

