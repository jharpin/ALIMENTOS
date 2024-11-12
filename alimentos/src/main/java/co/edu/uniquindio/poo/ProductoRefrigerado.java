package co.edu.uniquindio.poo;

public class ProductoRefrigerado extends Producto implements IProcesoRefrigeracion{
    private int codigoAprovacion;
    private double temperatura;

    public ProductoRefrigerado(int codigoAprovacion, double temperatura,int codigo,String nombre, double precioCompra, Proveedor proveedor){
        super(codigo,nombre,precioCompra,proveedor);
        this.codigoAprovacion=codigoAprovacion;
        this.temperatura=temperatura;
    }
@Override
    public void iniciarProcesoRefrigeración(){
        System.out.println("ya se inicio el proceso");
    }

    public int getCodigoAprovacion() {
        return codigoAprovacion;
    }

    public void setCodigoAprovacion(int codigoAprovacion) {
        this.codigoAprovacion = codigoAprovacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
