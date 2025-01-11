import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     System.out.println("Rentrez votre budget ");

     int budget = scanner.nextInt();

     System.out.println("Une pizza coute 10e rentrez le nombre de pizza que vous voulez ");

     int pizza = scanner.nextInt();

     int total = pizza * pizza; 

     if(total >= budget){
        System.out.println("Vous n'avez pas assez d'argent ");
     }

     else {System.out.print("Bonne appétit");}

    

        scanner.close();

    }
}
