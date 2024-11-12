package co.edu.uniquindio.poo;

public class ProductoEnvasado extends Producto {
    private String fechaEnvasado;
    private double pesoEnvase;
    private PaisOrigen paisOrigen;

    public ProductoEnvasado(String fechaEnvasado, double pesoEnvase, PaisOrigen paisOrigen,int codigo,String nombre, double precioCompra, Proveedor proveedor){
        super(codigo,nombre,precioCompra,proveedor);
        this.fechaEnvasado=fechaEnvasado;
        this.pesoEnvase=pesoEnvase;
        this.paisOrigen=paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvadaso(String fechaEnvasado){
        this.fechaEnvasado=fechaEnvasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString()+" ProductoEnvasado [fechaEnvasado=" + fechaEnvasado + ", pesoEnvase=" + pesoEnvase + ", paisOrigen="
                + paisOrigen + "]";
    }

   

}
