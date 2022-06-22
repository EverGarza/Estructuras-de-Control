class A 
{
    public static void main(String[] args) {
        System.out.println("Serie del 3");

        for (int i = 3; i <= 100; i+=3 ){
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("Los numeros pares de la serie son:");

        for (int i = 3; i <= 100; i+=3){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}