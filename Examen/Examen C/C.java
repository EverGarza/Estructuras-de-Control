import java.util.Scanner;

class C
{
    public static void main(String[] args) {
        Scanner TAlumno = new Scanner (System.in);
        System.out.print("Hola soy ");
        String nom = TAlumno.nextLine();
        System.out.print("y soy parte del grupo ");
        String grupo = TAlumno.nextLine();
        System.out.print("de la materia estructuras de control.");
    }
}