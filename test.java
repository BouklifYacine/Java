import java.util.Scanner;


class test {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

   double prix = 10; 
   boolean vieux = true;
   boolean etudiant = true;

   if(etudiant){
  
    System.out.println("Tu es étudiant tu as le droit a 20% de réduc");
    if (vieux) {
        System.out.println("Tu es vieux et étudiant tu as le droit a 30% de reduc");
        prix = prix * 0.7;
        System.out.println(prix);
    }
   }
   else if (vieux){
System.out.println("Tu es vieux tu as 10% de reduc");
prix = prix * 0.9;
System.out.println(prix);
   }
   else {
    prix = prix * 1;
    System.out.println(prix);
   }

       
      scanner.close();
}}
