/**
 * Clase que representa el armario mediante
 * una matriz de celdas.
 * @version 2.1
 */
public class Armario {

    // region atributos

    // endregion

    // region constructores
    public Armario(int filas, int columnas) {

    }
    // endregion

    // region getter y setter
    public int getCantidadArticulos() {
        int n = 0;
        return n;
    }

    public int getCapacidadArticulos() {
        return 0;
    }
    // endregion

    // region CRUD
    public Posicion estaArticulo(String id) {
        return null;
    }

    /**
     * Inserta un artículo en la primera posición libre de una celda.
     * Consulta si hay sitio en las celdas buscando sitio de la primera fila a la última.
     * Dentro de cada fila busca desde la primera columna a la última.
     * @param articulo referencia al artículo
     * @return devuelve la posición en la que se ha insertado o null si el armario está lleno.
     *         La posición considera que la primera fila y columna empiezan en 1.
     */
    public Posicion insertarArticulo(Articulo articulo) {
        return null;
    }

    public boolean insertarArticulo(Articulo articulo, Posicion posicion) {
        return true;
    }

    public Posicion sacarArticulo(String id) {
        return null;
    }
    // endregion

    public void pintar() {

    }

}
