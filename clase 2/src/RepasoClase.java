import java.util.Scanner;

public class RepasoClase {
    public static void main(String[] args) {

       String nombre = "Juan";
       int edad = 25;
       double estatura = 1.75;

       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite su nombre: ");
       nombre = entrada.nextLine();
       System.out.print("Digite su edad: ");
       edad = entrada.nextInt();
       System.out.print("Digite su estatura: ");
       estatura = entrada.nextDouble();

        System.out.println( "su nombre es: " + nombre + " y su edad es: " + edad + " y su estatura es: " + estatura);


        
    }

}

    

    



 

