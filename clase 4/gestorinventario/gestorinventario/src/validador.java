
class Validador {
    public static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }

    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }
}





// import java.util.Scanner;

// public class validador {

//     public static int leerEntero(Scanner entrada, String mensaje) {
//        while (true) {
//             System.out.print(mensaje);
//             if (entrada.hasNextInt()) {
//                 int valor = entrada.nextInt();
//                 entrada.nextLine(); // Limpiar el buffer de entrada
//                 return valor;
//             } else {
//                 System.out.println("Error: no es un numero entero, intenta un nuevo numero.");
//                     entrada.nextLine(); // Limpiar el buffer de entrada
         
//             }
//         }       
                
//     }

//      public static double leerDecimal(Scanner sc, String mensaje) {
//         while (true) {
//             System.out.print(mensaje);
//             if (sc.hasNextDouble()) {
//                 double valor = sc.nextDouble();
//                 sc.nextLine();
//                 return valor;
//             } else {
//                 System.out.println("Eso no es un numero valido. Intenta de nuevo.");
//                 sc.nextLine();
//             }
//         }
//     }

//     public static String leerTexto(Scanner sc, String mensaje) {
//         System.out.print(mensaje);
//         return sc.nextLine();
//     }
// }

