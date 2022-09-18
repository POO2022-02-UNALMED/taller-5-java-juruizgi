
/*package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private final ArrayList<Animal> animales = new ArrayList<>();
    public Zona(){
        zoo[0]=null;
    }
    
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = new Zoologico[1];
        this.zoo[0] = zoo;
    }
    
    public String getNombre(){
        if(zoo[0]==null){
            return null;
        }else{
            return nombre;
        }
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Zoologico getZoo(){
        if (zoo[0]!=null){
            return zoo[0];
        }else{
            return null;
        }
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