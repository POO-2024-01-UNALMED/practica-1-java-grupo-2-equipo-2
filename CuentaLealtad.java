public class CuentaLealtad{
    String titular;
    double puntos;

    public CuentaLealtad(String titular, double puntos){
        this.titular = titular;
        this.puntos = puntos;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getPuntos(){
        return puntos;
    }

    public void setSaldo(double puntos){
        this.puntos = puntos;
    }

}