package co.edu.uniquindio.poo;

public class Medicamento implements IProcesoRefrigeracion{
    private String nombre;

    public Medicamento(String nombre) {
        this.nombre = nombre;
    }
@Override
    public void iniciarProcesoRefrigeración(){
    System.out.println("medicamentos refigerados exitosamente");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
