
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Operaciones {

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

    static List<Producto> inventario = new ArrayList<>();

    public static void registrar(Scanner sc) {
        System.out.print("Ingrese nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        inventario.add(new Producto(nombre, cantidad, precio));
        System.out.println(" Producto registrado correctamente.");
    }

    public static void ver() {
        System.out.println("\n Lista de productos:");
        if (inventario.isEmpty()) {
            System.out.println("No hay datos disponibles.");
        } else {
            for (Producto p : inventario) {
                System.out.println("- " + p.nombre + " | Cantidad: " + p.cantidad + " | Precio: $" + p.precio);
            }
        }
    }

    public static void actualizarCantidad(Scanner sc) {
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

    public static void verValorTotal() {
        double total = 0;
        for (Producto p : inventario) {
            total += p.cantidad * p.precio;
        }
        System.out.println("\n Valor total del inventario: $" + total);
    }
}




// import java.util.Scanner;

// public class operaciones {

//     static final int MAX = 50;
//     static String[] nombres = new String[MAX];
//     static int[] cantidades = new int[MAX];
//     static double[] precios = new double[MAX];
//     static int total = 0;

//     public static void registrar(Scanner sc) {
//         if (total == MAX) {
//             System.out.println("Inventario lleno. No se pueden agregar mas productos.");
//             return;
//         }
//         nombres[total] = Validador.leerTexto(sc, "Nombre del producto: ");
//         cantidades[total] = Validador.leerEntero(sc, "Cantidad: ");
//         precios[total] = Validador.leerDecimal(sc, "Precio unitario: ");
//         total++;
//         System.out.println("Producto registrado correctamente.");
//     }

//     public static void listar() {
//         if (total == 0) {
//             System.out.println("Aun no hay productos registrados.");
//             return;
//         }
//         System.out.println("--- INVENTARIO ---");
//         for (int i = 0; i < total; i++) {
//             System.out.println((i + 1) + ". " + nombres[i]
//                     + " | cant: " + cantidades[i]
//                     + " | precio: " + precios[i]);
//         }
//     }

//     public static void actualizarCantidad(Scanner sc) {
//         if (total == 0) {
//             System.out.println("Aun no hay productos registrados.");
//             return;
//         }
//         listar();
//         int pos = Validador.leerEntero(sc, "Numero del producto a actualizar: ");
//         if (pos < 1 || pos > total) {
//             System.out.println("Ese numero no existe en el inventario.");
//             return;
//         }
//         cantidades[pos - 1] = Validador.leerEntero(sc, "Nueva cantidad: ");
//         System.out.println("Cantidad actualizada.");
//     }

//     public static void verValorTotal() {
//         if (total == 0) {
//             System.out.println("Aun no hay productos registrados.");
//             return;
//         }
//         double suma = 0;
//         for (int i = 0; i < total; i++) {
//             suma = suma + (cantidades[i] * precios[i]);
//         }
//         System.out.println("Valor total del inventario: " + suma);
//     }
// }

// // Simple helper validator to replace missing Validador class
// class Validador {
//     public static String leerTexto(Scanner sc, String prompt) {
//         System.out.print(prompt);
//         String line = sc.nextLine();
//         if (line == null) return "";
//         return line.trim();
//     }

//     public static int leerEntero(Scanner sc, String prompt) {
//         while (true) {
//             System.out.print(prompt);
//             String line = sc.nextLine();
//             try {
//                 return Integer.parseInt(line.trim());
//             } catch (Exception e) {
//                 System.out.println("Entrada invalida. Intente de nuevo.");
//             }
//         }
//     }

//     public static double leerDecimal(Scanner sc, String prompt) {
//         while (true) {
//             System.out.print(prompt);
//             String line = sc.nextLine();
//             try {
//                 return Double.parseDouble(line.trim());
//             } catch (Exception e) {
//                 System.out.println("Entrada invalida. Intente de nuevo.");
//             }
//         }
//     }
// }

// public class Operaciones {

//     // static String nombre = "";
//     // static int cantidad = 0;
//     // static double precio = 0.0;
//     static boolean hayProducto = false;
//     static final int MAX = 50;
//     static String[] nombres = new String[MAX];
//     static int[] cantidades = new int[MAX];
//     static double[] precios = new double[MAX];
//     static int total = 0;



//     // public static void registrar(Scanner sc) {
//     //     nombre = Validador.leerTexto(sc, "Nombre del producto: ");
//     //     cantidad = Validador.leerEntero(sc, "Cantidad: ");
//     //     precio = Validador.leerDecimal(sc, "Precio unitario: ");
//     //     hayProducto = true;
//     //     System.out.println("Producto registrado correctamente.");
//     // }

//         public static void registrar(Scanner sc) {
//         if (total == MAX) {
//             System.out.println("Inventario lleno. No se pueden agregar mas productos.");
//             return;
//         }
//         nombres[total] = Validador.leerTexto(sc, "Nombre del producto: ");
//         cantidades[total] = Validador.leerEntero(sc, "Cantidad: ");
//         precios[total] = Validador.leerDecimal(sc, "Precio unitario: ");
//         total++;
//         System.out.println("Producto registrado correctamente.");
//     }

//     public static void ver() {
//         if (!hayProducto) {
//             System.out.println("Aun no hay ningun producto registrado.");
//             return;
//         }
//         System.out.println("Producto: " + nombre);
//         System.out.println("Cantidad: " + cantidad);
//         System.out.println("Precio:   " + precio);
//     }

//     public static void actualizarCantidad(Scanner sc) {
//         if (!hayProducto) {
//             System.out.println("Aun no hay ningun producto registrado.");
//             return;
//         }
//         cantidad = Validador.leerEntero(sc, "Nueva cantidad: ");
//         System.out.println("Cantidad actualizada.");
//     }

//     public static void verValorTotal() {
//         if (!hayProducto) {
//             System.out.println("Aun no hay ningun producto registrado.");
//             return;
//         }
//         double total = cantidad * precio;
//         System.out.println("Valor total en inventario: " + total);
//     }
// }

