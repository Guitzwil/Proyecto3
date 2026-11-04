/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Edgar Mó
 */
public class GestorArchivos {
    private final String Archivo_Vehiculo = "vehiculos.txt";
    private final String Archivo_Pilotos = "pilotos.txt";
    private final String Archivo_Rutas = "rutas.txt";
    private final String Archivo_Mantenimiento = "mantenimiento.txt";
    private final String Archivo_Viajes = "viajes.dat";
    
public void guardarViajes(ArrayList<Viaje> listaViajes){
    try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(Archivo_Viajes))){
       oos.writeObject(listaViajes);
    } catch (IOException e){
        System.err.println("Error al guardar el archivo binario");
    }
}

@SuppressWarnings("uncheked")
public ArrayList<Viaje> cargarViajes(){
    File archivo = new File(Archivo_Viajes);
    if(!archivo.exists()){
       return new ArrayList(); 
    }
    try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream(Archivo_Viajes))){
       return (ArrayList<Viaje>) ois.readObject();
    }   catch (IOException | ClassNotFoundException e) {
          System.err.println("Aviso: No se pudieron caragar los viajes anteriores o el archivo esta vacio" + e.getMessage());
          return new ArrayList<>();
        }
    }

public void guardarRutas(ArrayList<Ruta> ListaRutas){
    try(PrintWriter pw = new PrintWriter(new FileWriter(Archivo_Rutas))){
       for(Ruta r : ListaRutas){
           pw.println(r.getOrigen() + "|" + r.getDestino() + "|" + r.getKilometros() + "|" + r.getTarifaBase());
       } 
    } catch(IOException e){
        System.err.println("Error al guardar el archivo de Rutas");
    }    
}

public ArrayList<Ruta> cargarRutas(){
    ArrayList<Ruta> lista = new ArrayList();
    File archivo = new File(Archivo_Rutas);
    if(!archivo.exists())
        return lista;
    
    try(BufferedeReader br =  new BufferedReader(new File))
}

}

