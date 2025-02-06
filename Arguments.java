public class Arguments {

    public static void main(String[] args) {
        // Vérification du nombre d'arguments
        if (args.length < 2) {
            System.out.println("Veuillez fournir un nom et un âge.");
            return;
        }

        // Récupération des arguments
        String nom = args[0];  // Le premier argument : le nom
        String age = args[1];   // Le deuxième argument : l'âge

        // Affichage du message
        System.out.println("Bonjour " + nom + " ! Vous avez " + age + " ans.");
    }
}