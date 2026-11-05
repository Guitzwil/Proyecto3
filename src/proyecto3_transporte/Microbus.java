/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public class Microbus extends Vehiculo {
    private int cantidadPasajeros;
    
    public Microbus(int cantidadPasajeros, String placa, double recargo){
        super(placa, recargo);
        setCantidadPasajeros(cantidadPasajeros);
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        //se valida que no sea menor o igual a cero
        if(cantidadPasajeros < 1)
            throw new IllegalArgumentException("La capacidad no puede ser menor a uno");
        
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public boolean validarCapacidadMaxima(double cantidad) {
        //se castea a un entero
        int pasajeros = (int) cantidad;
        
        return (pasajeros <= this.cantidadPasajeros);
    }

    @Override
    public String tipoVehiculo() {
        return ("Microbus");
    }
    
}
