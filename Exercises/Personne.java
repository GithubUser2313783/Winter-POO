package Exercises;

public class Personne {
    private byte age;
    private float taille;
    private String nomComplet;
 
    private double banque;
 
    public void setAge(byte age){
        if(age >= 0){
            this.age = age;
        }
        else{
            System.out.println("Age impossible");
        }
    }
 
    public byte getAge(){
        return this.age;
    }
 
    public void setName(String nomComplet){
        this.nomComplet = nomComplet;
    }

    public String getnomComplet(){
        return nomComplet;
    }

    public void setTaille(float taille){
        if(taille > 0){
            this.taille = taille;
        }
        else{
            System.out.println("Taille impossible");
        }
    }

    public float getTaille(){
        return this.taille;
    }


 
    public Personne(byte age, float taille, String nomComplet, double banque){
        this.setAge(age);
        this.setTaille(taille);
        this.nomComplet = nomComplet;
        this.banque = banque;
    }
 
    public double calculInteret(){
        return 0.02 * banque;
    }
 
}