import java.util.Scanner;

class Operaciones {
    static void registrar(Scanner sc) {}
    static void ver() {}
    static void actualizarCantidad(Scanner sc) {}
    static void verValorTotal() {}
}

class Menu {
    public static void mostrar(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n=== MENÚ DE INVENTARIO ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Ver valor total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: Operaciones.registrar(sc);
                    break;
                case 2: Operaciones.ver();
                    break;
                case 3: Operaciones.actualizarCantidad(sc);
                    break;
                case 4: Operaciones.verValorTotal();
                    break;
                case 5: System.out.println(" Saliendo del programa...");
                    break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}






// import java.util.Scanner;

// public class menu {
//     public class Menu {

//     public static void mostrar() {
//         System.out.println();
//         System.out.println("=== GESTOR DE INVENTARIO ===");
//         System.out.println("1. Registrar producto");
//         System.out.println("2. Ver producto");
//         System.out.println("3. Actualizar cantidad");
//         System.out.println("4. Ver valor total");
//         System.out.println("5. Salir");
//     }

//     public static int leerOpcion(Scanner sc) {
//         System.out.print("Elige una opcion: ");
//         return sc.nextInt();
//     }
// }

// }

