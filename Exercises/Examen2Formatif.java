public class Examen2Formatif {
    
}


/* Question 1
 * 
 * 
 * A: 2 - IndexOutOfBoundsException
 *  
 * B: 4 - ArrayIndexOutOfBoundsException
 * 
 * C: 5 - ArithmeticException
 * 
 * D: 3 - NullPointerException
 * 
 * E: 1 - IllegalArgumentException
 * 
 * 
 * Question 2
 * 
 * -Private
 * -Protected
 * -Public
 * 
 * 
 * 
 * Question 3
 * 
 * 
 * Int est la meilleure option car il couvre des valeurs bien plus large que nécessaire.
 * 
 * 
 * Question 4
 * 
 * Faux
 * 
 * 
 * Question 5
 * 
 * 1- private au deux attributs
 * 2- return this.titulaire dans getTitulaire()
 * 3- ; dans this.titulaire dans setTitulaire()
 * 4- { dans setSolde()
 * 5- double dans getSolde()
 * 6- double solde;
 * 7- += dans solde + montant
 * 8- System.out.println dans "Solde insuffisant"
 * 9- public void afficherSolde()
 * 10- no void CompteBancaire()
 * 11- this.titulaire and this.solde
 * 
 * 
 */

class CompteBancaire {
    private String titulaire;
    private String solde;

    public String getTitulaire() {
        return this.titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) { 
        this.solde = solde;
    }

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println("Montant déposé : " + montant);
        } else {
            System.out.println("Le montant doit être positif");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Montant retiré : " + montant);
        } else if(montant > this.solde){
            System.out.println("Solde insuffisant");
        } else {
            System.out.println("Le montant doit être positif.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : " + this.solde);
    }

    public void afficherInfo() {
        System.out.println("Titulaire : " + this.titulaire + ", Solde: " + this.solde + "€");
    }
}