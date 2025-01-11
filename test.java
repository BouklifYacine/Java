import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prix = 10;
        boolean vieux = true;
        boolean etudiant = true;

        if (etudiant && vieux) {
        
            System.out.println("Tu es étudiant et âgé, tu as droit à 30% de réduction.");
            prix = prix * 0.7;
        } else if (etudiant) {
        
            System.out.println("Tu es étudiant, tu as droit à 20% de réduction.");
            prix = prix * 0.8;
        } else if (vieux) {
           
            System.out.println("Tu es âgé, tu as droit à 10% de réduction.");
            prix = prix * 0.9;
        } else {
          
            System.out.println("Tu n'as droit à aucune réduction.");
        }

        System.out.println("Le prix final est : " + prix);

        scanner.close();
    }
}