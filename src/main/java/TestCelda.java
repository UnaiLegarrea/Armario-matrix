public class TestCelda {

    public static void main(String[] args) {
        String id;
        Celda celda = new Celda();
        System.out.println("Celda vacía:");
        celda.pintar();
        celda.insertarArticulo(new Articulo("PROD0001", "Producto 0001", 100));
        celda.insertarArticulo(new Articulo("PROD0002", "Producto 0002", 200));
        celda.insertarArticulo(new Articulo("PROD0003", "Producto 0003", 300));
        celda.insertarArticulo(new Articulo("PROD0004", "Producto 0004", 400));
        System.out.println("Celda con 4 artículos:");
        celda.pintar();
        celda.sacarArticulo("PROD0002");
        celda.sacarArticulo("PROD0004");
        System.out.println("Celda tras sacar 2 artículos:");
        celda.pintar();
        System.out.println("Hay " + celda.getCantidadArticulos() + " artículos de una capacidad de " + celda.getCapacidadArticulos());
        id = "PROD0001";
        System.out.println("Está el producto " + id + " : " + celda.estaArticulo(id));
        id = "PROD0002";
        System.out.println("Está el producto " + id + " : " + celda.estaArticulo(id));
    }

}
