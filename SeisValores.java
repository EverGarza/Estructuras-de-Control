import java.util.Scanner;

class SeisValores
{
    public static void main(String[] args) 
    {
        int a, b, c, d, e, f;
        Scanner TValores = new Scanner(System.in);
        System.out.print("Ingresa el valor a): ");
        a = TValores.nextInt();
        System.out.print("Ingresa el valor b): ");
        b = TValores.nextInt();
        System.out.print("Ingresa el valor c): ");
        c = TValores.nextInt();
        System.out.print("Ingresa el valor d): ");
        d = TValores.nextInt();
        System.out.print("Ingresa el valor e): ");
        e = TValores.nextInt();
        System.out.print("Ingresa el valor f): ");
        f = TValores.nextInt();

        if (a > b && a > c && a > d && a > e && a > f)
        {
            System.out.println("El valor mayor es: " + a);
        } else if (b > a && b > c && b > d && b > d && b > e && b > e) {
            System.out.println("El valor mayor es: " + b);            
        } else if (c > a && c > b && c > d && c > e && c > f) {
            System.out.println("El valor mayor es: " + c);
        } else if (d > a && d > b && d > c && d > e && d > f) {
            System.out.println("El valor mayor es: " + d);
        } else if (e > a && e > b && e > c && e > d && e > e && e > f) {
            System.out.println("El valor mayor es: " + e);
        } else if (f > a && f > b && f > c && f > d && f > e) {
            System.out.println("El valor mayor es: " + f);
        }
    }
}