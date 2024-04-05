package Clases;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
        private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
        
    
    @Override
    public String toString() {
        return "Persona{" + "fechaActual=" + fechaNacimiento + '}';
    }
    
    public void calcularEdad(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int años = periodo.getYears();
        System.out.println("Tiene: " + años + " AÑOS, " + meses + " MESES Y " + dias + " DIAS.");
    }
    
}
