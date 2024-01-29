public class TestArmario {

    public static void main(String[] args) {
        Posicion posicion;
        int num;
        String id;

        Armario armario = new Armario(Ctes.LIM_FILAS, Ctes.LIM_COLUMNAS);
        System.out.println("Armario vacío:");
        armario.pintar();

        for (int i = 1; i <= Ctes.LIM_FILAS; i++) {                 //filas
            for (int j = 1; j <= Ctes.LIM_COLUMNAS; j++) {          //columnas
                for (int k = 1; k <= Ctes.LIM_ARTICULOS; k++) {     //articulos
                    id = "PROD0"+i+j+k;
                    armario.insertarArticulo(new Articulo(id, "Producto " + id, 100*k ));
                }
            }
        }
        System.out.println("Armario lleno:");
        armario.pintar();

        num = 3;                                                    //fila
        for (int j = 1; j <= Ctes.LIM_COLUMNAS; j++) {              //columnas
            for (int k = 1; k <= Ctes.LIM_ARTICULOS; k++) {         //articulos
                id = "PROD0"+num+j+k;
                armario.sacarArticulo(id);
            }
        }
        for (int i = 1; i <= 4; i++) {                              //filas
            num = 2;                                                //columna
            for (int k = 1; k <= 4; k++) {                          //articulos
                id = "PROD0"+i+num+k;
                armario.sacarArticulo(id);
            }
        }
        for (int i = 1; i <= 4; i++) {                              //filas
            for (int j = 1; j <= 5; j++) {                          //columnas
                num = 4;                                            //articulo
                id = "PROD0"+i+j+num;
                armario.sacarArticulo(id);
            }
        }
        System.out.println("Armario con la fila 3 y la columna 2 y todos los artículos 4 quitados:");
        armario.pintar();

        System.out.println("Hay " + armario.getCantidadArticulos() + " artículos de una capacidad de " + armario.getCapacidadArticulos());
        id = "PROD0243";
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
        id = "PROD0454";
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
    }

}
