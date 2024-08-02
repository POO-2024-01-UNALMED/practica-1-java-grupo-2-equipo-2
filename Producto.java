public class Producto{
    String nombre;
    double cantidad;
    String fabrica;
    double precio;

    public Producto(String nombre, double cantidad, String fabrica, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fabrica = fabrica;
        this.precio = precio;
    }
            
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getFabrica() {
        return fabrica;
    }
    
    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}