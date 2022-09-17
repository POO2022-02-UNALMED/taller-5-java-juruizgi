/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    
    public Ave(){
        super();
        Ave a = this;
        listado.add(a);
    }
    
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        Ave a = this;
        listado.add(a);
    }
    
    public String getColorPlumas(){
        return colorPlumas;
    }
    
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }
    
    @Override
    public String movimiento(){
        return "volar";
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave a = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        listado.add(a);
        halcones++;
        return a;
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave a = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(a);
        aguilas++;
        return a;
    }
    
    public static int cantidadAves(){
        return halcones+aguilas;
    }
    
    public static ArrayList<Ave> getListado(){
        return listado;
    }
    
    public static void setListado(ArrayList<Ave> listado){
        Ave.listado = listado;
    }
}
