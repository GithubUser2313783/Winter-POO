import java.util.ArrayList;
import java.util.Scanner;
public class ExamenPratique {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taches = new ArrayList<String>();
        ArrayList<Boolean> isDone = new  ArrayList<Boolean>();
        String choix;
        while(true){
            System.out.println("1.Ajouter une tâche");
            System.out.println("2.Marquer une tâche comme terminée");
            System.out.println("3.Afficher les tâches");
            System.out.println("4.Terminer le programme");
            System.out.println("-" * 40);
            System.out.println("Nombre de tâche : " + taches.size());
            System.out.println("-".repeat(60) + "\n");


            System.out.print("Entrez votre choix : ");
            choix = scanner.next();

            if(choix.equals("1")){
                System.out.print("Entrez la tâche à ajouter : ");
                choix = scanner.next();
    
                taches.add(choix);
                isDone.add(false);
                System.out.println("Tâche ajoutée : " + choix);
            }
            else if(choix.equals("2")){
                System.out.print("Entrez le numéro de la tâche à marquer comme terminée : ");
                choix = scanner.next();
                isDone.set(Integer.parseInt(choix),true);
                System.out.println("Tâche terminée : " + taches.get(Integer.parseInt(choix)));
            }
            else if(choix.equals("3")){
               afficherTaches(taches, isDone);
            }
            else if(choix.equals("4")){
                afficherTaches(taches, isDone);
                System.out.println("\nMerci d'avoir utilisé le gestionnaire de tâches!");
                break;
             }
            scanner.nextLine();scanner.nextLine();


            System.out.println("\n" + "-".repeat(60) + "\n");

        }
    }
    public static void afficherTaches(ArrayList<String> taches, ArrayList<Boolean> isDone){
        System.out.println("\n\nTâches : \n");
        for(int i = 0; i < taches.size(); i++){
            System.out.printf("%d.%s %s\n",i ,taches.get(i) , isDone.get(i) ? " (Complété)" : " (Non complété)");
        }
    }
}



/*    public class CompteBancaire{
        String titulaire;
        double solde;
        public CompteBancaire(String titulaire, double solde){
            this.titulaire = titulaire;
            this.solde = solde;
        }
        public void deposer(double montant){
            if(montant > 0){
                this.solde += montant;
                System.out.printf("%.02f$ déposé. Nouveau solde : %.02f$\n",montant,this.solde);
            }
            else{
                System.out.println("Montant invalide");
            }
        }
        public void retirer(double montant){
            if(montant > 0){
                if(montant <= this.solde){
                    this.solde -= montant;
                    System.out.printf("%.02f$ retiré. Nouveau solde : %.02f$\n",montant,this.solde);

                }
                else{
                    System.out.println("Solde insuffisant");
                }
            }
            else{
                System.out.println("Montant invalide");
            }
        }
        public void afficherInfo(){
            System.out.printf("Titulaire : %s | Solde : %.02f$\n", this.titulaire, this.solde);
        }
        public static void main(String[] args) {
            CompteBancaire Alice = new CompteBancaire("Alice Dupont", 500.75);
            Alice.afficherInfo();
            Alice.deposer(150);
            Alice.retirer(200);
            Alice.retirer(500);

        }
    }

    public class Trie {
        public static void main(String[] args) {
            int[] tab = new int[10];
            for( int i = 0; i < tab.length ; i++){
                tab[i] = (int)(Math.random() * 101);
            }

            System.out.print("[");
            afficheTableau(tab);
            int indiceMin;
            int mem;
            for( int i = 0; i < tab.length ; i++){
                indiceMin = i;
                for(int j = i + 1; j < tab.length; j++){
                    if(tab[j] < tab[indiceMin]){
                        indiceMin = j;
                    }
                }
                mem = tab[indiceMin];
                tab[indiceMin] = tab[i];
                tab[i] = mem;
                
            }
            afficheTableau(tab);
        }
        public static void afficheTableau(int[] tab){
            for( int i = 0; i < tab.length - 1 ; i++){
                System.out.print(tab[i] + ", ");
            }
            System.out.println( tab[tab.length - 1] + "]");
        }
    }

    import java.util.Scanner;

    public class Alphabet {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.next();

            n = n % 26

            char letter = 'a';

            for(int i = 0; i < n; i++) {
                System.out.print(letter);
                letter++;
            }

        Scanner.close();

        }
    }*/