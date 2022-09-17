/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Animal {
    
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private final Zona zona[] = new Zona[1];
    
    public Animal(){totalAnimales++;}
    
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    
    public String getHabitat(){
        return habitat;
    }
    
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public static int getTotalAnimales(){
        return totalAnimales++;
    }
    
    public Zona getZona(){
        return zona[0];
    }
    
    public void setZona(Zona zona){
        this.zona[0] = zona;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.getListado().size()+
                "\nAves: "+Ave.getListado().size()+
                "\nReptiles: "+Reptil.getListado().size()+
                "\nPeces: "+Pez.getListado().size()+
                "\nAnfibios: "+Anfibio.getListado().size();
                
    }
    
    @Override
    public String toString(){
        
        if (this.zona[0]==null){
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
        }else{
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+this.zona[0].getNombre()+" en el "+this.zona[0].getZoo()[0].getNombre();
            
        }
    }
    
}
