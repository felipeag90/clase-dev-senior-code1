import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("plato #  " + i + "  recibo");
        }

        int mesasporAtender = 5;
        while (mesasporAtender > 0) {
            System.out.println("mesas por atender: " + mesasporAtender);
            mesasporAtender--;
        }
        System.out.println( "todo limpio");

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("x:\n ----cajero---");
            System.out.println("1. nuevo pedido");
            System.out.println("2. cerrar caja");
            System.out.println("elegir opcion: ");
            opcion = entrada.nextInt();

        
        
            switch (opcion) {
            case 1:
                System.out.println("subtotal");
                double subtotal = entrada.nextDouble();
                double total = subtotal, porcentaje = 0.10;
                System .out.println("total con propina: " + (total + (total * porcentaje)));
                break;


            case 2:
                System.out.println("cerrando caja");
                break;

            default:
                System.out.println("opcion no valida");
                break;
            }
        } while (opcion != 2);

        System.out.println("saliste del menu");
    }

static double calcularTotal(double subtotal, double porcentaje) {
    double propina = subtotal * porcentaje;
    return subtotal + propina;
    }
}
