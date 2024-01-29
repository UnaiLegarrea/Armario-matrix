public class Celda {

    // region atributos

    // endregion


    public Celda() {

    }

    // region getter y setter
    public int getCapacidadArticulos() {
        return 0;
    }

    /**
     * Obtiene el artículo de la celda correspondiente a su número
     * @param numeroArticulo número del 1 a la capacidad de la celda
     *                       se supone comprobado antes, no se valida
     * @return referencia al artículo correspondiente, puede ser null
     */
    public Articulo getArticulo(int numeroArticulo) {
        return null;
    }

    public int getCantidadArticulos() {
        int n = 0;
        return n;
    }
    // endregion

    // region métodos privados

    /**
     * Si el id del artículo de una posición coincide
     * @param id identificador del artículo
     * @param numeroArticulo posición en la celda del 1 a la capacidad de la celda
     *                       no se verifica el rango
     * @return verdadero si coincide
     */
    private boolean esArticulo(String id, int numeroArticulo) {
        return false;
    }

    /**
     * Si la posición no tiene una referencia a un artículo
     * @param numeroArticulo valor del 1 a la capacidad de la celda
     *                       no se verifica el rango
     * @return verdadero si no hay una referencia a un objeto (es decir, es null)
     */
    private boolean estaVacio(int numeroArticulo) {
        return false;
    }
    // endregion

    // region CRUD

    public boolean haySitio() {
        return false;
    }

    public boolean estaArticulo(String id) {
        return false;
    }

    public boolean insertarArticulo(Articulo articulo) {
        return false;
    }

    public boolean sacarArticulo(String id) {
        return false;
    }
    // endregion

    public void pintar() {

    }

}
