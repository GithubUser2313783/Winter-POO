package Exercises;

public class Exo129 {
    public static void main(String[] args) {
        
    }
}

class Personne{
    private String name;
    private int age;
    private String address;

    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public Personne(String name, int age, String address){
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public void sePresenter(String name, int age, String address){
        System.out.printf("Je suis " + this.name + ", j'ai " + this.age + " ans et mon adresse est " + this.address);
    }
}

class Etudiant extends Personne{
    private String filiere;
    private String numEtudiant;

    public void setFiliere(String filiere){
        this.filiere = filiere;
    }

    public String getFiliere(){
        return this.filiere;
    }

    public void setNumEtudiant(String numEtudiant){
        this.numEtudiant = numEtudiant;
    }

    public String getNumEtudiant(){
        return this.numEtudiant;
    }

    public Etudiant(String nom, int age, String address){
        super(nom, age, address);
        this.setFiliere(filiere);
        this.setNumEtudiant(numEtudiant);
    }

    public void etudier(){
        System.out.printf("L'étudiant");
    }

    public void seDecrire(){
        super.sePresenter();
        System.out.printf("Je suis en filiere " + filiere + ", Numero Étudiant: " + numEtudiant);
    }
}





