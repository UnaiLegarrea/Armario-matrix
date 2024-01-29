import java.util.Random;

public class Loader {

    // region atributos
    private static int numeroArticulo = 1;
    private static Random generadorAleatorio;
    // endregion

    public static void cargarDatos(Armario armario) {
        Articulo articulo;
        boolean b;
        int numeroTipo, numeroFila, numeroColumna, precioArticulo;
        String nombreTipo, idArticulo, nombreArticulo;
        Posicion posicion;
        generadorAleatorio = new Random();
        for (int i = 0; i < Ctes.NUM_ARTICULOS_INI; i++) {
            numeroTipo = getAleatorio(Ctes.NUM_TIPO_ARTICULOS);
            nombreTipo = getTipoArticulo(numeroTipo);
            numeroFila = getAleatorio(Ctes.LIM_FILAS);
            numeroColumna = getAleatorio(Ctes.LIM_COLUMNAS);
            precioArticulo = getAleatorio();
            idArticulo = String.format("%s%02d",nombreTipo, numeroArticulo);
            nombreArticulo = "Artículo de tipo " + nombreTipo + " con id " + idArticulo;
            articulo = new Articulo(idArticulo, nombreArticulo, precioArticulo);
            posicion = new Posicion(numeroFila, numeroColumna);
            //System.out.println(posicion);
            b = armario.insertarArticulo(articulo, posicion);
            if (b) {
                numeroArticulo++;
            }
        }
    }

    // region métodos privados
    private static int getAleatorio(int hasta) {
        return generadorAleatorio.nextInt(hasta) + 1;
    }

    private static int getAleatorio() {
        return generadorAleatorio.nextInt(Ctes.MIN_PRECIO, Ctes.MAX_PRECIO + 1);
    }

    private static String getTipoArticulo(int tipo) {
        switch (tipo) {
            case 1: return "RELOJ";
            case 2: return "MOVIL";
            case 3: return "TABLE";
            case 4: return "EBOOK";
            case 5: return "LAMPA";
            default: return "CAMAR";
        }
    }
    // endregion

}
