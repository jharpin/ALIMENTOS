package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Farmacia {
    private String nombre;
    private LinkedList<Medicamento> Medicamentos;
    
    public Farmacia(String nombre,LinkedList<Medicamento>Medicamentos){
        this.nombre=nombre;
        this.Medicamentos=new LinkedList<>();

    }

    public void agregarMedicamento(Medicamento medicamento){
        Medicamentos.add(medicamento);
    }

    public void eliminarMedicamentos(Medicamento medicamento){
        Medicamentos.remove(medicamento);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Medicamento> getMedicamentos() {
        return Medicamentos;
    }
    public void setMedicamentos(LinkedList<Medicamento> medicamentos) {
        Medicamentos = medicamentos;
    }

    
    
}
