import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom : ");
        String name = scanner.nextLine();
        System.out.println("Entrez votre age : ");
        int age = scanner.nextInt();
        System.out.println("Entrez votre temps de permis : ");
        double permis = scanner.nextDouble();
        System.out.println("Bonjour " + name );
        System.out.println("Tu as " + age + "ans" );
        System.out.println("Tu as " + permis + "ans de permis" );


        scanner.close();

    }
}
