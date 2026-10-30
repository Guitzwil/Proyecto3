/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public class Bus extends Vehiculo {
    private int cantidadPasajeros;
    private int cantidadEjes;
    
    public Bus(int cantiadPasajeros, int cantidadejes, String placa, String estado, double kilometraje, double recargo){
        super(placa, estado, kilometraje, recargo);
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    
    
}
