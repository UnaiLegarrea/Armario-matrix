/**
 * Clase principal de la aplicación.
 * Contiene el bucle principal de ejecución.
 * @version 1.0
 */
public class App {

    private Armario armario;

    public App() {
        armario = new Armario(Ctes.LIM_FILAS, Ctes.LIM_COLUMNAS);
    }

    public void run() {
        int numOpc;
        boolean bExit = false;

        Loader.cargarDatos(armario);

        while (!bExit) {
            Gui.mostrarMenu();
            numOpc = Gui.leerOpcion();
            bExit= ejecutarOpcion(numOpc);
        }

    }

    private boolean ejecutarOpcion(int numOpc) {
        switch (numOpc) {
            case Ctes.OPC_EXIT:
                return true;
            case Ctes.OPC_DISPLAY:
                mostrarArmario();
                return false;
            case Ctes.OPC_QUERY:
                consultarArticulo();
                return false;
            case Ctes.OPC_INSERT_FIRST:
                insertarArticuloPrimerHueco();
                return false;
            case Ctes.OPC_INSERT_POSITION:
                insertarArticuloPosicion();
                return false;
            case Ctes.OPC_REMOVE:
                sacarArticulo();
                return false;
            default:
                return false;
        }
    }

    private void mostrarArmario() {
        armario.pintar();
        System.out.println("Hay " + armario.getCantidadArticulos() + " artículos.");
    }

    private void consultarArticulo() {
        String id;
        Posicion posicion;
        id = Gui.leerIdArticulo();
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
    }

    private void insertarArticuloPrimerHueco() {
        Posicion posicion;
        Articulo articulo;
        articulo = Gui.leerArticulo();
        posicion = armario.insertarArticulo(articulo);
        if (posicion != null) {
            System.out.println("El artículo " + articulo + " se ha metido en la " + posicion);
        }else{
            System.out.println("El artículo " + articulo + " NO se ha metido en el armario");
        }
    }

    private void insertarArticuloPosicion() {
        Posicion posicion;
        Articulo articulo;
        articulo = Gui.leerArticulo();
        posicion = Gui.leerPosicion();
        if (armario.insertarArticulo(articulo, posicion)) {
            System.out.println("El artículo " + articulo + " se ha metido en la " + posicion);
        }else{
            System.out.println("El artículo " + articulo + " NO se ha metido en el armario");
        }
    }

    private void sacarArticulo() {
        String id;
        Posicion posicion;
        id = Gui.leerIdArticulo();
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
            if (Gui.leerConfirmacion("Seguro que desea sacarlo [S/N]", "S")) {
                armario.sacarArticulo(id);
                System.out.println("Artículo sacado");
            }else{
                System.out.println("Artículo NO sacado");
            }
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
    }

}
