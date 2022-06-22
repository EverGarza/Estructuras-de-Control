import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] args) {
        Scanner TValor = new Scanner (System.in);
        int n = 0;
        do {
            System.out.println("Ingresa el valor de n: ");
            n = TValor.nextInt();
        } while (n < 1 || n > 10);
        if (n < 3 && n > 8) {
            System.out.println("Dentro");
        } else {
            System.out.println("Fuera");
        }
    }
}