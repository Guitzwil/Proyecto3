/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public abstract class Vehiculo {
    private String placa;
    private String estado;
    private double kilometraje;
    private double recargo;
    
    public Vehiculo(String placa, String estado, double kilometraje, double recargo){
        this.placa = placa;
        this.estado = estado;
        this.kilometraje= kilometraje;
        this.recargo = recargo;
    }
    
    
    
}
