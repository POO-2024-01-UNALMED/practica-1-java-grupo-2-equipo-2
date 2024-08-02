import java.util.ArrayList;

public class Tienda{
    String nombre;
    String direccion;
    double calificacion;
    ArrayList<Producto> productos;

    public Tienda(String nombre, String direccion, double calificacion, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.productos = productos;
    }

    public String getNombre(){
        return nombre;
    }

    public void String setNombre(String nombre){
        this.nombre = nombre
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion
    }

    public double getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(){
        this.calificacion = calificacion
    }

    public ArrayList<Producto> getProducto(){
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos){
        this.productos = productos;
    }

}