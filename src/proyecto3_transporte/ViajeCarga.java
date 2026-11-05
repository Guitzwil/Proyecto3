/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class ViajeCarga extends Viaje{
    //atributos 
    private double quintales;
    
    //constructor

    public ViajeCarga(double quintales, Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, LocalTime hora) {
        super(vehiculo, ruta, piloto, fecha, hora);
        this.quintales = quintales;
    }
    
    //metodos

    public double getCantidad() {
        return quintales;
    }
    
    @Override
    public double calcularTotal(){
        return (super.getVehiculo().getRecargo() * quintales);
    }
}
