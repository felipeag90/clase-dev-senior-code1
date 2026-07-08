import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.println("El nombre del cliente es: " + nombre);

        System.out.println(" cuantas personas en la mesa: ");
        int personas = entrada. nextint();
        
        entrada.nextLine();

        System.out.println( "mesa de" + nombre + "," + personas + "personas");

        double subtotal = 120000;
        boolean descuento = true;

        boolean descuentoAplicado = subtotal > 100000 && tienecupon;
        System.out.println("aplica descuento? " + descuentoAplicado);

        int unidades = 5;
        double comodecimal = unidades;
        System.out.println("implicita " + comodecimal);

        double precio = 19990.75; 
        int precioRecortado = (int) precio;
        System.out.println("casting " + precioRecortado);
        

    }
}
