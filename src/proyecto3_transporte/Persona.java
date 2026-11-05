/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.io.Serializable;

/**
 *
 * @author estudiante
 */
public abstract class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //atributos
    private String nombre;
    private String dpi;
    private String telefono;
    
    //constructor
    public Persona(String nombre, String dpi, String telefono) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
    }
    
    //metodos 
    public boolean esDpi(String dpi){
        return (this.dpi.equalsIgnoreCase(dpi));
    }
    
    public boolean esNombre(String nombre){
        return (this.nombre.equalsIgnoreCase(nombre));
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
