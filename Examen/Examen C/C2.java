import java.util.Scanner;

class C2
{
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        String nom, grupo;
        System.out.print("Nombre: ");
        nom = Teclado.nextLine();
        System.out.print("Grupo: ");
        grupo = Teclado.nextLine();
        System.out.println("Hola soy " + nom + " y soy parte del grupo " + grupo + " de la materia aplica estructuras de control con un lenguaje de programacion.");
    }
}