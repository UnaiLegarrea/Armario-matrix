/**
 * Clase que representa el armario mediante
 * una matriz de celdas.
 * @version 2.1
 */
public class Armario {

    // region atributos
    private Celda[][] armario;
    private int total;
    // endregion

    // region constructores

    /**
     *
     * @param filas numero de filas de nuestra matriz, si es mayor que el limite de filas
     * se inicializa al limite
     * @param columnas numero de columnas de nuestra matriz, si es mayor que el limite de
     * columnas
     * se inicializa al limite
     */
    public Armario(int filas, int columnas) {
        armario = new Celda [filas][columnas];
        if(filas>Ctes.LIM_FILAS){
            armario = new Celda[Ctes.LIM_FILAS][columnas];
        }
        if (columnas>Ctes.LIM_COLUMNAS){
            armario = new Celda[armario.length][Ctes.LIM_COLUMNAS];
        }
        total = 0;
    }
    // endregion

    // region getter y setter
    /**
     * metodo que recorre la matriz armario y devuelve la cantidad de articulos que hay en ella
     */
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
