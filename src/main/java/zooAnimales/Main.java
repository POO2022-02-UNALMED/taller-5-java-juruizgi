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
public class Main {
    public static void main(String args[]){
        Ave an2 = new Ave("paloma",5,"ciudad","F","gris");
        Zona z = new Zona("nueva",new Zoologico("epa","sisa"));
        an2.setZona(z);
        System.out.println(an2);
    }
}
