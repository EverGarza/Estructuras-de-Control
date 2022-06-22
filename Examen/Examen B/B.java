import java.util.Scanner;

class B 
{
    public static void main(String[] args) {
        String Nom;
        int Edad;
        Scanner TPersona = new Scanner (System.in);
        System.out.print("Nombre: ");
        Nom = TPersona.nextLine();
        System.out.print("Edad: ");
        Edad = TPersona.nextInt();

        if(Edad > 17){
            System.out.println(Nom + " es mayor de edad para tramitar su INE.");
        } else {
            System.out.println(Nom + " es menor de edad.");
        }
        
    }
}