class Ejercicio3 
{
    public static void main(String[] args) 
    {
        int acum = 0;
        for (int con = 1; con <= 10; con++)
        {
            if (con >= 5) { 
                if (acum - con < 0) {
                    acum = acum + con / 2;
                } else {
                    acum = acum - con / 3;
                } 
            }
        }    
        System.out.println(acum);
    }
}