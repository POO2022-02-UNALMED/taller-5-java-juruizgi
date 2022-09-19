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
public class Reptil extends Animal{

    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    
    
    public Reptil(){
        super();
        Reptil re = this;
        listado.add(re);
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil re = this;
        listado.add(re);
    }
    
    public String getColorEscamas(){
        return colorEscamas;
    }
    
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    
    public static ArrayList<Reptil> getListado(){
        return listado;
    }
    
    public static void setListado(ArrayList<Reptil> listado){
        Reptil.listado = listado;
    }
    
    public int getLargoCola(){
        return largoCola;
    }
    
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }
    
    /*public static ArrayList<Reptil> getListado(){
        return Reptil.listado;
    }*/
    
    /*public static void setListado(ArrayList<Reptil> listado){
        Reptil.listado = listado;
    }*/
    
    @Override
    public String movimiento(){
        return "reptar";
    }
    
    public static int cantidadReptiles(){
        return iguanas+serpientes;
    }
    
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil r = new Reptil(nombre, edad, "humedal", genero, "verde",3);
        listado.add(r);
        iguanas++;
        return r;
    }
    
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil r = new Reptil(nombre, edad, "jungla", genero, "blanco",1);
        listado.add(r);
        serpientes++;
        return r;
    }
    
}
