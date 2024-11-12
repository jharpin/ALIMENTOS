package co.edu.uniquindio.poo;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String fechaVencimiento,int codigo,String nombre, double precioCompra, Proveedor proveedor){

        super(codigo,nombre,precioCompra,proveedor);
        this.fechaVencimiento=fechaVencimiento;
    }

    public double PrecioVenta(){
        double precio=0;
        precio=getPrecioCompra()*0.35;
        return precio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoPerecedero [fechaVencimiento=" + fechaVencimiento + "]";
    }
    
}
