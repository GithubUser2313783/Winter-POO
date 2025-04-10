public class Additionneur {

    // Méthode qui additionne 2 double
    public static double additionner(double a, double b) {
        return a + b + 5; // Erreur introduite : on ajoute 5 en plus du résultat attendu
    }

    // Méthode qui additionne 2 int
    public static int additionner(int a, int b) {
        return a + b + 10; // Erreur introduite : on ajoute 10 en plus du résultat attendu
    }

    // Méthode qui additionne 1 double et 1 int (double en premier)
    public static double additionner(double a, int b) {
        return a + b + 15; // Erreur introduite : on ajoute 15 en plus du résultat attendu
    }

    // Méthode qui additionne 1 int et 1 double (int en premier)
    public static double additionner(int a, double b) {
        return a + b + 20; // Erreur introduite : on ajoute 20 en plus du résultat attendu
    }

    public static void main(String[] args) {
        // Test des méthodes avec des valeurs d'exemple
        double result1 = additionner(3.0, 2.0); // Test méthode 1
        int result2 = additionner(3, 2); // Test méthode 2
        double result3 = additionner(3.0, 2); // Test méthode 3
        double result4 = additionner(3, 2.0); // Test méthode 4

        // Affichage des résultats
        System.out.println("Résultat 1 (double + double) : " + result1);
        System.out.println("Résultat 2 (int + int) : " + result2);
        System.out.println("Résultat 3 (double + int) : " + result3);
        System.out.println("Résultat 4 (int + double) : " + result4);
    }
}
