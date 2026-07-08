public class opciones {
    public static void main(String[] args) {

        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("nuevo pedido");
                break;
            case 2:
                System.out.println("aplicar descuento");
                break;
            case 3:
                System.out.println("cerrar caja");
                break;
            default:
                System.out.println("opcion no valida");
        }

}
