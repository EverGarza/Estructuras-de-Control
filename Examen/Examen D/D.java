import java.util.Scanner;

class D
{
    public static void main(String[] args) {
        Scanner TCal = new Scanner (System.in);
        int cal[] = new int[4];
        int r = 1;
        int i = 0;
        do {
            System.out.print("Calificacion " + r + ": ");
            cal[i] = TCal.nextInt();
            i++;
            r++;
        } while(i < 4);

        int promedio = (cal[0] + cal[1] + cal[2] + cal[3]) / 4; 
        if (promedio >= 60){
            System.out.println("Tu promedio es: " + promedio + " eres aprobado.");
        } else {
            System.out.println("Eres reprobado.");
        }
    }
}