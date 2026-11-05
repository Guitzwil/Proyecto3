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
    private String numeroLicencia;
    private String tipoLicencia;
    private String estado;
    
    //constructor
    public Piloto(String numeroLicencia, String tipoLicencia, String nombre, String dpi, String telefono) {
        super(nombre, dpi, telefono);
        this.numeroLicencia = numeroLicencia;
        this.tipoLicencia = tipoLicencia;
        this.estado = "activo";
    }
 
    //metodos
    public boolean esNumeroLicencia(String numeroLicencia){
        return (this.numeroLicencia.equalsIgnoreCase(numeroLicencia));
    }
    
    public boolean esTipoLicencia(String tipo){
        return (this.tipoLicencia.equalsIgnoreCase(tipo));
    }
    
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public String getEstado() {
        return estado;
    }
  
    public void setEstado(String estado){
        //se valida que solo se activo o inactivo
        if(!estado.equalsIgnoreCase("activo") || !estado.equalsIgnoreCase("inactivo"))
            return;
        
        this.estado = estado;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
}
