package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    public Anfibio(){
        super();
        Anfibio an = this;
        listado.add(an);
    }
    
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio an = this;
        listado.add(an);
        
    }
    
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }
    
    public String getColorPiel(){
        return colorPiel;
    }
    
    public boolean isVenenoso(){
        return venenoso;
    }
    
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }
    
    @Override
    public String movimiento(){
        return "saltar";
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio an = (new Anfibio(nombre, edad, "selva", genero, "rojo", true));
        listado.add(an);
        ranas++;
        return an;
    }
    
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio an = (new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false));
        listado.add(an);
        salamandras++;
        return an;
    }
    
    public static int cantidadAnfibios(){
        return listado.size();
    }
    
    public static ArrayList<Anfibio> getListado(){
        return listado;
    }
    
    public static void setListado(ArrayList<Anfibio> lista){
        listado = lista;
    }
}
