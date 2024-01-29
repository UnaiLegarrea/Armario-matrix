/**
 * Hace referencia a una posición del armario
 * dada por un número de fila y de columna.
 * @version 2.1
 */
public class Posicion {

    private int numeroFila;
    private int numeroColumna;

    public Posicion(int numeroFila, int numeroColumna) {
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
    }

    // region getter y setter
    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }
    // endregion

//    public String toString() {
//        return "(" + numeroBalda + "," + numeroCelda + ")";
//    }
    public String toString() {
        return "fila " + numeroFila + " columna " + numeroColumna;
    }

}
