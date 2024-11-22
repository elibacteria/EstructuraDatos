package proyectofinaleddmain;

import javax.swing.*;
import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private int id;
    private double precio;
    private int cantidadInventario;
    
    public Producto(){
    }

    public Producto(String nombre, int id, double precio, int cantidadInventario) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
    
    @Override
    public int compareTo(Producto o) {
        if(this.id == o.getId()){
            return 0;
        }
        if(this.id < o.getId()){
            return -1;
        }
        if(this.id > o.getId()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Producto{nombre = '" + nombre + '\'' +
                ", id = " + id + 
                ", precio = " + precio + 
                ", cantidadInventario = " + cantidadInventario;
    }
}
