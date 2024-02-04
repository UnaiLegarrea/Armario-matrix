/**
 * Clase que representa el armario mediante
 * una matriz de celdas.
 * @version 2.1
 */
public class Armario {

    // region atributos
    private Celda[][] armario;
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
        for (int i = 0; i < armario.length; i++) {
            for (int j = 0; j < armario[i].length; j++) {
                armario[i][j]= new Celda();
            }
        }
    }
    // endregion

    // region getter y setter
    /**
     * metodo que recorre la matriz armario
     * @return devuelve la cantidad de articulos en el armario
     */
    public int getCantidadArticulos() {
        int n = 0;
        for (int i = 0; i < armario.length; i++) {
            for (int j = 0; j < armario[i].length; j++) {
                n += armario[i][j].getCantidadArticulos();
            }
        }
        return n;
    }

    /**
     *
     * @return
     */
    public int getCapacidadArticulos() {
        return armario.length*armario[0].length*armario[0][0].getCapacidadArticulos();
    }
    // endregion

    // region CRUD

    /**
     *
     * Recorre la matriz armario
     * @param id del articulo que se busca
     * @return Posicion del articulo, null si no existe .
     * La posición considera que la primera fila y columna empiezan en 1.
     */
    public Posicion estaArticulo(String id) {
        Posicion aux;
        for (int i = 0; i < armario.length; i++) {
            for (int j = 0; j < armario[i].length; j++) {
                if (armario[i][j].estaArticulo(id)){
                    return new Posicion(i+1,j+1);
                }
            }
        }
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
        for (int i = 0; i < armario.length; i++) {
            for (int j = 0; j < armario[i].length; j++) {
                if (armario[i][j].haySitio()){
                    armario[i][j].insertarArticulo(articulo);
                    return new Posicion(i+1,j+1);
                }
            }
        }
        return null;
    }

    /**
     * Inserta un articulo en la primera posición libre de una celda.
     *
     * @param articulo referencia del articulo
     * @param posicion referencia a la posición donde se va a insertar el articulo
     * @return true si se ha conseguido insertar o false si no se consigue
     */
    public boolean insertarArticulo(Articulo articulo, Posicion posicion) {
        if (posicion.getNumeroFila()>armario.length||posicion.getNumeroColumna()>armario[0].length){return false;}
        if (armario[posicion.getNumeroFila()-1][posicion.getNumeroColumna()-1].haySitio()){
            armario[posicion.getNumeroFila()-1][posicion.getNumeroColumna()-1].insertarArticulo(articulo);
            return true;
        }
        return false;
    }

    /**
     * saca un articulo del armario
     * @param id del articulo que se quiere sacar
     * @return evuelve la posición en la que se ha sacado o null si el no existe el articulo.
     *      *         La posición considera que la primera fila y columna empiezan en 1.
     */
    public Posicion sacarArticulo(String id) {
        for (int i = 0; i < armario.length; i++) {
            for (int j = 0; j < armario[i].length; j++) {
                if (armario[i][j].sacarArticulo(id)){return new Posicion(i+1,j+1);}
            }
        }
        return null;
    }
    // endregion


    public void pintar() {

        System.out.println("#".repeat(14*armario[0].length+1));
        for (int i = 0; i < armario.length; i++) {
            System.out.println("-".repeat(14*armario[0].length+1));
            for (int k = 0; k < Ctes.LIM_ARTICULOS; k++) {
                for (int j = 0; j < armario[i].length; j++) {
                    if (armario[i][j].getArticulo(k) ==null){System.out.printf("|%12s "," ");}
                    else{
                        System.out.printf("|%12s ",armario[i][j].getArticulo(k));
                    }
                }
                System.out.print("|\n");
            }
            System.out.println("-".repeat(14*armario[0].length+1));
        }
        System.out.println("#".repeat(14*armario[0].length+1));
    }

}
