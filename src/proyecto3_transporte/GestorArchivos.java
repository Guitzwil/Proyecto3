/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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
    
    try(BufferedReader br =  new BufferedReader(new FileReader(archivo))){
        String linea;
        while((linea = br.readLine()) !=null){
            String[] partes = linea.split(",");
            if(partes.length == 4){
                String origen = partes[0];
                String destino = partes[1];
                double kilometros = Double.parseDouble(partes[2]);
                double tarifaBase = Double.parseDouble(partes[3]);
                lista.add(new Ruta(origen, destino, kilometros, tarifaBase));
                
            }
        }
    }catch (IOException | NumberFormatException e){
        System.err.println("Error al leer el archivo de Rutas: " + e.getMessage());
    }
    return lista;
}

public void guardarVehiculos(ArrayList<Vehiculo> listaVehiculo){
    try(PrintWriter pw =   new PrintWriter (new FileWriter (Archivo_Vehiculo))){
        for(Vehiculo v : listaVehiculo){
            String tipo = v.getClass().getSimpleName();
            pw.println(tipo + "|" + v.getPlaca() + "|" + v.getEstado() + "|" +v.getKilometraje() + "|" + v.getRecargo());
        }
    } catch(IOException e){
        System.err.println("Error al guardar vehiculos: " + e.getMessage());
    }
}

public ArrayList<Vehiculo> cargarVehiculos() {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        File archivo = new File(Archivo_Vehiculo);
        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String placa = partes[0];
                    double recargo = Integer.parseInt(partes[1]);
                    String estado = partes[2];
                    double kilometraje = Double.parseDouble(partes[3]);

                    Vehiculo v = null;
                    if (tipo.equalsIgnoreCase("Bus")) {
                        int pasajeros = Integer.parseInt(partes[5]);
                        int ejes = Integer.parseInt(partes[6]);
                        v = new Bus(pasajeros, ejes, placa, estado, kilometraje, recargo);
 
                    } else if (tipo.equalsIgnoreCase("Microbus")) {
                        int pasajeros = Integer.parseInt(partes[5]);
                        boolean escolar = Boolean.parseBoolean(partes[6]);
                        v = new Microbus(pasajeros, escolar, placa, estado, kilometraje, recargo);
 
                    } else if (tipo.equalsIgnoreCase("Pickup")) {
                        String motor = partes[5];
                        String traccion = partes[6];
                        double capacidadCarga = Double.parseDouble(partes[7]);
                        v = new Pickup(motor, traccion, capacidadCarga, placa, estado, kilometraje, recargo);
                    }
                    
                    if (v != null) {
                        lista.add(v);
                    }
                } 
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo de vehículos: " + e.getMessage());
        }
        return lista;
}

// --- PILOTOS ---
    public void guardarPilotos(ArrayList<Piloto> listaPilotos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Archivo_Pilotos))) {
            for (Piloto p : listaPilotos) {
                pw.println(p.getNombre() + "," + p.getDpi() + "," + p.getTelefono() + "," + p.getNumeroLicencia() + "," + p.getTipoLicencia());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar pilotos: " + e.getMessage());
        }
    }

    public ArrayList<Piloto> cargarPilotos() {
        ArrayList<Piloto> lista = new ArrayList<>();
        File archivo = new File(Archivo_Pilotos);
        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 7) {
                    String nombre = partes[0];
                    String dpi = partes[1];
                    String telefono = partes[2];
                    boolean disponibilidad = Boolean.parseBoolean(partes[3]);
                    String idPiloto = partes[4];
                    String numLicencia = partes[5];
                    String tipoLicencia = partes[6];
                    lista.add(new Piloto(nombre, dpi, telefono,numLicencia, tipoLicencia));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de pilotos: " + e.getMessage());
        }
        return lista;
    }
    
        
}

