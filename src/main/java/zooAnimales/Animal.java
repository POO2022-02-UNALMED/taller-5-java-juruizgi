/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;
import gestion.*;
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
    private ArrayList<Zona> zona = new ArrayList<>();
    
<<<<<<< HEAD
    public Animal(){
        totalAnimales++;
        zona.add(new Zona("defatult",new Zoologico()));
        
    }
=======
    public Animal(){totalAnimales++
                    zona.add(new Zona("default",new Zoologico()))";}
>>>>>>> f9331f496e2b0cfbc505fba94c604a6a4ffe5efb
    
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
<<<<<<< HEAD
        zona.add(new Zona("default",new Zoologico()));
=======
        zona.add(new Zona("default",new Zoologico()))
>>>>>>> f9331f496e2b0cfbc505fba94c604a6a4ffe5efb
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
        return zona.get(0);
    }
    
    public void setZona(Zona zona){
        this.zona.set(0,zona);
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
        
<<<<<<< HEAD
        if (this.zona.get(0).getZoo().getNombre()!=null && this.zona.get(0).getNombre()!=null){
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.get(0).getNombre()+" en el "+zona.get(0).getZoo().getNombre();
=======
        if (this.zona.get(0)!=null){
            if (zona.get(0).getZoo()==null){
                return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+null+" en el "+null;

            }else if(zona.get(0).getZoo().getNombre()==null){
                return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.get(0).getNombre()+" en el "+null;
            }else{
                return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.get(0).getNombre()+" en el "+zona.get(0).getZoo().getNombre();
            }
>>>>>>> f9331f496e2b0cfbc505fba94c604a6a4ffe5efb
            
        }else{
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
        }
    }
    
}
