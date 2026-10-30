/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author estudiante
 */
public abstract class Persona {
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
    public String getNombre() {
        return nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
