package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private final ArrayList<Animal> animales = new ArrayList<>();

    public Zona(){
        zoo[0] = new Zoologico();
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
    
    public Zoologico getZoo(){
        return zoo[0];
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