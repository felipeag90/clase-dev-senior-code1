public class metodos {

    public static void main(String[] args) {
        double propina = calcularPropina(200000, 0.10);
        System.out.println("La propina es: " + propina);
    }

    public static double calcularPropina(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }
}
