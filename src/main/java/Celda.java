public class Celda {

    // region atributos
    private Articulo[] celda;
    private int total;
    // endregion


    /**
     * Constructor que inicializa el array celda a la constante LIM_ARTICULOS
     */
    public Celda() {
        celda = new Articulo[Ctes.LIM_ARTICULOS];
        total = 0;
    }

    // region getter y setter
    public int getCapacidadArticulos() {
        return celda.length;
    }

    /**
     * Obtiene el artículo de la celda correspondiente a su número
     * @param numeroArticulo número del 1 a la capacidad de la celda
     *                       se supone comprobado antes, no se valida
     * @return referencia al artículo correspondiente, puede ser null
     */
    public Articulo getArticulo(int numeroArticulo) {
        return celda[numeroArticulo];
    }
    public int getCantidadArticulos() {
        int n = 0;
        for (int i = 0; i < total; i++) {
            if (!estaVacio(i)){
                n++;
            }
        }
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
        return id.equals(celda[numeroArticulo].getId());
    }
    /**
     * Si la posición no tiene una referencia a un artículo
     * @param numeroArticulo valor del 1 a la capacidad de la celda
     *                       no se verifica el rango
     * @return verdadero si no hay una referencia a un objeto (es decir, es null)
     */
    private boolean estaVacio(int numeroArticulo) {
        return celda[numeroArticulo] == null;
    }
    // endregion

    // region CRUD

    /**
     *@return  true si la cantidad de articulos es menor que 4 sino devuelve false
     *
     */
    public boolean haySitio() {
        return getCantidadArticulos()<4;
    }

    /**
     *
     * @param id del articulo que buscamos
     * @return true si esta el articulo sino devuelve false
     */
    public boolean estaArticulo(String id) {
        for (int i = 0; i < total; i++) {
            if (celda[i]!=null && esArticulo(id,i)){return true;}
        }
        return false;
    }

    /**
     *
     * @param articulo que se quiere insertar en nuestro array
     * @return true si se ha conseguido insertar sino false
     */
    public boolean insertarArticulo(Articulo articulo) {
        for (int i = 0; i < celda.length; i++) {
            if (estaVacio(i)){
                celda[i]=articulo;
                total++;
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param id del articulo que queremos sacar
     * @return devuelve true si hemos conseguido sacar el articulo
     */

    public boolean sacarArticulo(String id) {
        for (int i = 0; i < total; i++) {
            if (celda[i]!=null&&esArticulo(id,i)){
                for (int j = i; j < total-1; j++) {
                    celda[j] = celda[j+1];
                }
                celda[total-1] = null;
                total--;
                return true;
            }
        }
        return false;
    }
    // endregion

    public void pintar() {
        for (int i = 0; i < celda.length; i++) {
            if (celda[i]== null){System.out.printf("|%11s |\n"," ");}
            else{System.out.printf("|%11s |\n",celda[i]);};
        }
    }

}
