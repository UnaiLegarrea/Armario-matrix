public class Articulo {

    // region atributos
    private String id;
    private String nombre;
    private double precio;
    // endregion


    // region constructores
    public Articulo(String id, String nombre, double precio) {
        this.id = id.toUpperCase();
        this.nombre = nombre;
        this.precio = precio;
    }

    public Articulo() {
        this("", "", 0.0);
    }
    // endregion

    // region getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // endregion

    @Override
    public String toString() {
        return id;
    }

}
