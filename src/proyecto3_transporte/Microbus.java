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
    private boolean esTransporteEscolar;
    
    public Microbus(int cantidadPasajeros, boolean esTransporteEscolar, String placa, String estado, double kilometraje, double recargo){
        super(placa, estado, kilometraje, recargo);
        this.cantidadPasajeros = cantidadPasajeros;
        this.esTransporteEscolar = esTransporteEscolar;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isEsTransporteEscolar() {
        return esTransporteEscolar;
    }

    public void setEsTransporteEscolar(boolean esTransporteEscolar) {
        this.esTransporteEscolar = esTransporteEscolar;
    }
    
}
