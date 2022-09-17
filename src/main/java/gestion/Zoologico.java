/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private final ArrayList<Zona> zonas = new ArrayList<>();
    
    public Zoologico(){}
    
    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    
    public int cantidadTotalAnimales(){
        int contador = 0;
        for(Zona z: zonas){
            contador=contador+z.cantidadAnimales();
        }
        
        return contador;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public ArrayList<Zona> getZona(){
        return zonas;
    }
}
