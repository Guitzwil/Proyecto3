/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author estudiante
 */
public abstract class Viaje implements Facturable, Serializable{
    private static final long serialVersionUID = 1L;
    
    //atributos
    private Vehiculo vehiculo;
    private Ruta ruta;
    private Piloto piloto;
    private LocalDate fecha;
    private String estadoViaje;
    private LocalTime hora;
    
    //constructor

    public Viaje(Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, LocalTime hora) {
        this.vehiculo = vehiculo;
        this.ruta = ruta;
        this.piloto = piloto;
        this.fecha = fecha;
        this.estadoViaje = "ruta";
        this.hora = hora;
    }
    
    //metodos

    public abstract String cantidad();
    
    public boolean esEstadoViaje(String estado){
        return (this.estadoViaje.equalsIgnoreCase(estado));
    }
    
    public boolean esFecha(LocalDate fecha){
        return this.fecha.equals(fecha);
    }
    
    public boolean esVehiculo(Vehiculo vehiculo){
        return this.vehiculo.getPlaca().equalsIgnoreCase(vehiculo.getPlaca());
    }
    
    public boolean esPiloto(Piloto piloto){
        return this.piloto.getNumeroLicencia().equalsIgnoreCase(piloto.getNumeroLicencia());
    }
    
    public void setEstadoViaje(String estado){        
        //se valida que el estado solo sea finalizado
        if(!estado.equalsIgnoreCase("finalizado")) return;
        
        this.estadoViaje = estado;
    }
    
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
