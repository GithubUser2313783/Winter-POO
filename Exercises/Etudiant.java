package Exercises;

public class Etudiant{
	int age;
	String nom = "John Doe";

	public Etudiant(String nom, int age){
		this.nom = nom;
		this.age = age;
	}

	public void afficherInfo(){
		System.out.println("ME " + this.nom + " ME " + this.age);
	}

	public static void afficher(){
		System.out.println("I am a class");
	}


	public static void main(String[] args) {
		Etudiant bob = new Etudiant("Bob", 15);
		Etudiant mary = new Etudiant("Mary", 16);
		bob.afficherInfo();
		mary.afficherInfo();
		Etudiant.afficher();
	}
}

