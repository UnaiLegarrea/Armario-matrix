import java.util.Scanner;

public class Gui {

    public static void mostrarMenu() {
        System.out.println("*****************************************");
        System.out.println("*       A   R   M   A   R   I   O       *");
        System.out.println("*****************************************");
        System.out.println(" 1. Ver armario");
        System.out.println(" 2. Consultar artículo");
        System.out.println(" 3. Insertar artículo primer hueco");
        System.out.println(" 4. Insertar artículo en una posición");
        System.out.println(" 5. Sacar artículo");
        System.out.println(" 0. Exit");
        System.out.println("*****************************************");
    }

    public static int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public static String leerIdArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Identificador del artículo: ");
        return scanner.nextLine().trim();
    }

    public static Articulo leerArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%30s: ", "Identificador del artículo");
        String id = scanner.nextLine().trim();
        System.out.printf("%30s: ", "Nombre del artículo");
        String nombre = scanner.nextLine().trim();
        System.out.printf("%30s: ", "Precio del artículo");
        double precio = Double.parseDouble(scanner.nextLine().trim());
        return new Articulo(id, nombre, precio);
    }

    public static Posicion leerPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%22s: ", "Número de la fila");
        int numeroFila = scanner.nextInt();
        System.out.printf("%22s: ", "Número de la columna");
        int numeroColumna = scanner.nextInt();
        return new Posicion(numeroFila, numeroColumna);
    }

    public static boolean leerConfirmacion(String txt, String iniConfirmacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s: ", txt);
        String respuesta = scanner.nextLine().trim();
        return respuesta.toUpperCase().startsWith(iniConfirmacion.toUpperCase());
    }

}
