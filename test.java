import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     System.out.println("Rentrez votre budget ");

     int budget = scanner.nextInt();

     System.out.println("Quel est le montant d'une pizza?  ");

     int pizza = scanner.nextInt();

     System.out.println("Vous en voulez combien?  ");

     int quantite = scanner.nextInt();
     
     int total = pizza * quantite;

     int prixrestant = total - budget;

     if(total > budget){
        System.out.println("Vous n'avez pas assez d'argent il vous manque :  " + prixrestant + " " + "euros" );
     }

     else {System.out.print("Cela vous coute " + total + " euros" + " ." + " Bonne appétit");}

        scanner.close();

    }


}
