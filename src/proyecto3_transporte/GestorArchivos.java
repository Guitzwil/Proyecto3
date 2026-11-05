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
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Edgar Mó
 */
public class GestorArchivos {
    private final String Archivo_Vehiculo = "vehiculos.dat";
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
           pw.println(r.getOrigen() + "|" + r.getDestino() + "|" 
                   + r.getKilometros() + "|" + r.getTarifaBase() + "|" + (r.isEstado() ? "s" : "n"));
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
            String[] partes = linea.split("\\|");
            if(partes.length < 5 || partes.length > 5) continue;
            
            String origen = partes[0];
            String destino = partes[1];
            double kilometros = Double.parseDouble(partes[2]);
            double tarifaBase = Double.parseDouble(partes[3]);
            boolean estado = partes[4].equalsIgnoreCase("s");
            
            lista.add(new Ruta(origen, destino, kilometros, tarifaBase));
            lista.get(lista.size() - 1).setEstado(estado);
        }
    }catch (IOException | NumberFormatException e){
        System.err.println("Error al leer el archivo de Rutas: " + e.getMessage());
    }
    return lista;
}

public void guardarVehiculos(ArrayList<Vehiculo> listaVehiculo){
    try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(Archivo_Vehiculo))){
       oos.writeObject(listaVehiculo);
    } catch (IOException e){
        System.err.println("Error al guardar el archivo binario");
    }
}

public ArrayList<Vehiculo> cargarVehiculos() {
    File archivo = new File(Archivo_Vehiculo);
    if(!archivo.exists()){
       return new ArrayList(); 
    }
    try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream(Archivo_Vehiculo))){
       return (ArrayList<Vehiculo>) ois.readObject();
    }   catch (IOException | ClassNotFoundException e) {
          System.err.println("Aviso: No se pudieron caragar los vehiculos anteriores o el archivo esta vacio" + e.getMessage());
          return new ArrayList<>();
    }
}

// --- PILOTOS ---
    public void guardarPilotos(ArrayList<Piloto> listaPilotos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Archivo_Pilotos))) {
            for (Piloto p : listaPilotos) {
                pw.println(p.getNombre() + "|" + p.getDpi() + "|" + p.getTelefono() + "|" + 
                        p.getNumeroLicencia() + "|" + p.getTipoLicencia() + "|" + p.getEstado());
                        
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
                String[] partes = linea.split("\\|");
                if (partes.length > 7) continue;
                
                String nombre = partes[0];
                String dpi = partes[1];
                String telefono = partes[2];
                String numLicencia = partes[3];
                String tipoLicencia = partes[4];
                String estado = partes[5];
                
                lista.add(new Piloto(numLicencia, tipoLicencia, nombre, dpi, telefono));
                lista.get(lista.size() - 1).setEstado(estado);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de pilotos: " + e.getMessage());
        }
        return lista;
    }
    
    public void guardarMantenimientos(ArrayList<Mantenimiento> listaMantenimientos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Archivo_Mantenimiento))) {
            for (Mantenimiento m : listaMantenimientos) {
                String placa = (m.getVehiculo() != null) ? m.getVehiculo().getPlaca() : "";
                pw.println(placa + "|" + m.getFecha() + "|" + m.getCosto());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar mantenimientos: " + e.getMessage());
        }
    }

    public ArrayList<Mantenimiento> cargarMantenimientos(ArrayList<Vehiculo> listaVehiculos) {
        ArrayList<Mantenimiento> lista = new ArrayList<>();
        File archivo = new File(Archivo_Mantenimiento);
        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 3) {
                    String placaVehiculo = partes[0];
                    LocalDate fecha = LocalDate.parse(partes[1]);
                    double costo = Double.parseDouble(partes[2]);

                    Vehiculo vehiculoEncontrado = null;
                    for (Vehiculo v : listaVehiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placaVehiculo)) {
                            vehiculoEncontrado = v;
                            break;
                        }
                    }

                    if (vehiculoEncontrado != null) {
                        lista.add(new Mantenimiento(vehiculoEncontrado, fecha, costo));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer mantenimientos: " + e.getMessage());
        }
        return lista;
    }    
}

