/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
/**
 *
 * @author USUARIO
 */
public class Zona {
    
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private final ArrayList<Animal> animales = new ArrayList<>();

    public Zona(){
    }
    
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = new Zoologico[1];
        this.zoo[0] = zoo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Zoologico[] getZoo(){
        return zoo;
    }
    
    public void setZoo(Zoologico zoo){
        this.zoo[0]=zoo;
    }
    
    public ArrayList<Animal> getAnimales(){
        return animales;
    }
    
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    
    public int cantidadAnimales(){
        return animales.size();
    }
}
