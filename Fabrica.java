import java.util.ArrayList;

public class Fabrica{
    String nombre;
    String categoria;
    String direccion;
    double calificacion;
    ArrayList<Producto> catalogo;

    public Fabrica(String nombre, String categoria, String direccion, double calificacion, Arraylist<Producto> catalogo){
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.catalogo = catalogo;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public double getCalificion(){
        return calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

    public ArrayList<Producto> getProducto(){
        return categoria;
    }

    public void setProductos(ArrayList<Producto> categoria){
        this.categoria = categoria;
    }

}