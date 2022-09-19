package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;    
    
    public Pez(){
        super();
        Pez p = this;
        listado.add(p);
    }
    
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.cantidadAletas = cantidadAletas;
        this.colorEscamas = colorEscamas;
        Pez p = this;
        listado.add(p);
    }
    
    @Override
    public String movimiento(){
        return "nadar";
    }
    
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez p = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        listado.add(p);
        salmones++;
        return p;
    }
    
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez p = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        listado.add(p);
        bacalaos++;
        return p;
    }
    
    public static int cantidadPeces(){
        return listado.size();
    }
    
    public int getCantidadAletas(){
        return cantidadAletas;
    }
    
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }
    
    public String getColorEscamas(){
        return colorEscamas;
    }
    
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    
    public static ArrayList<Pez> getListado(){
        return Pez.listado;
    }
    
    public static void setListado(ArrayList lista){
        listado = lista;
    }
}
