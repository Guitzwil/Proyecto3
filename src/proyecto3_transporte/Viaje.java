/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author estudiante
 */
public abstract class Viaje implements Facturable{
    //atributos
    private Vehiculo vehiculo;
    private Ruta ruta;
    private Piloto piloto;
    private LocalDate fecha;
    private String estadoViaje;
    private LocalTime hora;
    
    //constructor

    public Viaje(Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, String estadoViaje, LocalTime hora) {
        this.vehiculo = vehiculo;
        this.ruta = ruta;
        this.piloto = piloto;
        this.fecha = fecha;
        this.estadoViaje = estadoViaje;
        this.hora = hora;
    }
    
    //metodos

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstadoViaje() {
        return estadoViaje;
    }

    public LocalTime getHora() {
        return hora;
    }
    
}
