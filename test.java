import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom = "Yacine le jefe";
        String prenom = nom.substring(0,6);
        System.out.println(prenom);
        // Trouver la longueur de la string
        System.out.println(nom.length());
        // Trouver la valeur de d'un caractère
        System.out.println(nom.charAt(0));
        // Trouver le premier endroit ou y'a le caractère
        System.out.println(nom.indexOf("a"));
        // Trouver le dernier endroit ou y'a le caractère
        System.out.println(nom.lastIndexOf("a"));
        // Mettre tout en minuscule
        System.out.println(nom.toLowerCase());
        // Mettre tout en majuscule
        System.out.println(nom.toUpperCase());
        // Mettre tout en minuscule
        System.out.println(nom.trim());


        String palworld = "Palworld";

       

        String promo = (palworld.length() == 8) ? "C'est égal a 8" : "c'est pas égal a 5";

        System.out.println(promo);


        scanner.close();
    }
}