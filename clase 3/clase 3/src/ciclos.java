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

        do {
            System.out.println("1. continuar 2. salir");
            System.out.println("elegir opcion: ");
            opcion = entrada.nextInt();
        } while (opcion != 2);

        System.out.println("saliste del menu");
    }
}
