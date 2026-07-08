import java.util.Scanner;

public class cajero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("subtotal de la cuenta: ");
        double subtotal = entrada.nextDouble();
    
        if (subtotal > 200000) {
            System.out.println("aplica descuento VIP aplidado");
        } else if (subtotal > 100000) {
            System.out.println("aplica descuento normal aplicado");
        } else {
            System.out.println("sin descuento");
        }
        

}
