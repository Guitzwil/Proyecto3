/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author estudiante
 */
public class Ruta {
    //atributos
    private String origen;
    private String destino;
    private double kilometros;
    private double tarifaBase;
    
    //constructor
    public Ruta(String origen, String destino, double kilometros, double tarifaBase) {
        this.origen = origen;
        this.destino = destino;
        this.kilometros = kilometros;
        this.tarifaBase = tarifaBase;
    }
 
    //metodos
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getKilometros() {
        return kilometros;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }
    
}
