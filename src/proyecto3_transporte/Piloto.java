/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author estudiante
 */
public class Piloto extends Persona{
    //metodos
    private String idPiloto;
    private String numeroLicencia;
    private String tipoLicencia;
    private boolean disponibilidad;
    
    //constructor
    public Piloto(String idPiloto, String numeroLicencia, String tipoLicencia, boolean disponibilidad, String nombre, String dpi, String telefono) {
        super(nombre, dpi, telefono);
        this.idPiloto = idPiloto;
        this.numeroLicencia = numeroLicencia;
        this.tipoLicencia = tipoLicencia;
        this.disponibilidad = disponibilidad;
    }
 
    //metodos
    public String getIdPiloto() {
        return idPiloto;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    
}
