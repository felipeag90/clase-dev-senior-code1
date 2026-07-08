import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static class Producto {
        String nombre;
        int cantidad;
        double precio;

        Producto(String nombre, int cantidad, double precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
    }

    static class Operaciones {
        static List<Producto> inventario = new ArrayList<>();

        static void registrar(Scanner sc) {
            System.out.print("Ingrese nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            inventario.add(new Producto(nombre, cantidad, precio));
            System.out.println(" Producto registrado correctamente.");
        }

        static void ver() {
            System.out.println("\n Lista de productos:");
            if (inventario.isEmpty()) {
                System.out.println("No hay datos disponibles.");
            } else {
                for (Producto p : inventario) {
                    System.out.println("- " + p.nombre + " | Cantidad: " + p.cantidad + " | Precio: $" + p.precio);
                }
            }
        }

        static void actualizarCantidad(Scanner sc) {
            System.out.print("Ingrese nombre del producto a actualizar: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese nueva cantidad: ");
            int nuevaCantidad = Integer.parseInt(sc.nextLine());

            boolean encontrado = false;
            for (Producto p : inventario) {
                if (p.nombre.equalsIgnoreCase(nombre)) {
                    p.cantidad = nuevaCantidad;
                    System.out.println(" Producto " + nombre + " actualizado a cantidad " + nuevaCantidad);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(" Producto no encontrado.");
            }
        }

        static void verValorTotal() {
            double total = 0;
            for (Producto p : inventario) {
                total += p.cantidad * p.precio;
            }
            System.out.println("\n Valor total del inventario: $" + total);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                case 1:
                    Operaciones.registrar(sc);
                    break;
                case 2:
                    Operaciones.ver();
                    break;
                case 3:
                    Operaciones.actualizarCantidad(sc);
                    break;
                case 4:
                    Operaciones.verValorTotal();
                    break;
                case 5:
                    System.out.println(" Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}




// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int opcion = 0;

//         while (opcion != 5) {
//             Menu.mostrar();
//             opcion = Menu.leerOpcion(sc);

//             switch (opcion) {
//                 case 1:
//                     Operaciones.registrar(sc);
//                     break;
//                 case 2:
//                     Operaciones.ver();
//                     break;
//                 case 3:
//                     Operaciones.actualizarCantidad(sc);
//                     break;
//                 case 4:
//                     Operaciones.verValorTotal();
//                     break;
//                 case 5:
//                     System.out.println("Gracias por usar el gestor. Hasta pronto.");
//                     break;
//                 default:
//                     System.out.println("Opcion no valida. Elige entre 1 y 5.");
//             }
//         }
//         sc.close();
//     }

//     // Minimal local Menu implementation to resolve reference when external menu.Menu is unavailable.
//     static class Menu {
//         static void mostrar() {
//             System.out.println("\n--- Gestor de Inventario ---");
//             System.out.println("1. Registrar producto");
//             System.out.println("2. Ver productos");
//             System.out.println("3. Actualizar cantidad");
//             System.out.println("4. Ver valor total");
//             System.out.println("5. Salir");
//             System.out.print("Elige una opcion: ");
//         }

//         static int leerOpcion(Scanner sc) {
//             try {
//                 return sc.nextInt();
//             } catch (InputMismatchException e) {
//                 sc.nextLine(); // consume invalid
//                 return -1;
//             }
//         }
//     }

//     // Minimal local Operaciones implementation to resolve reference when external Operaciones is unavailable.
//     static class Operaciones {
//         static void registrar(Scanner sc) {
//             sc.nextLine(); // consume remainder
//             System.out.print("Ingrese nombre del producto: ");
//             String nombre = sc.nextLine();
//             System.out.print("Ingrese cantidad: ");
//             try {
//                 int cantidad = Integer.parseInt(sc.nextLine());
//                 System.out.println("Producto '" + nombre + "' registrado con cantidad " + cantidad + ".");
//             } catch (NumberFormatException e) {
//                 System.out.println("Cantidad invalida. Registro cancelado.");
//             }
//         }

//         static void ver() {
//             System.out.println("Lista de productos (implementacion minima): No hay datos disponibles.");
//         }

//         static void actualizarCantidad(Scanner sc) {
//             sc.nextLine();
//             System.out.print("Ingrese nombre del producto a actualizar: ");
//             String nombre = sc.nextLine();
//             System.out.print("Ingrese nueva cantidad: ");
//             try {
//                 int cantidad = Integer.parseInt(sc.nextLine());
//                 System.out.println("Producto '" + nombre + "' actualizado a cantidad " + cantidad + ".");
//             } catch (NumberFormatException e) {
//                 System.out.println("Cantidad invalida. Actualizacion cancelada.");
//             }
//         }

//         static void verValorTotal() {
//             System.out.println("Valor total del inventario (implementacion minima): 0.0");
//         }
//     }
// }
