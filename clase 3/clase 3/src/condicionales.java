public class condicionales {
    public static void main(String[] args) {
        
        double cuenta = 150000;

        if (cuenta > 200000) {
            System.out.println("aplica descuento VIP (15%)");
        } else if (cuenta > 100000) {
            System.out.println("aplica descuento normal (10%)");
        } else {
            System.out.println("sin descuento");
        }

        
    }

}
