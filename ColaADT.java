package tarea8main;

import java.util.LinkedList;

public class ColaADT<E> {
    private LinkedList<E> data;
    
    public ColaADT(){
        this.data = new LinkedList<>();
    }
    
    public boolean estaVacia(){
        boolean respuesta = false;
        if(this.data.size() == 0){
            respuesta = true;
        }
        return respuesta;
    }
    
    public int longitud(){
        return this.data.size();
    }
    
    public E frente(){
        return this.data.getFirst();
    }
    
    //enqueue
    public void encolar(E valor){
        this.data.addLast(valor);
    }
    
    public E desEncolar(){
        return this.data.removeFirst();
    }
    
    @Override
    public String toString(){
        String resultado = "";
        for (E clienteBanco : data) {
            resultado += clienteBanco.toString() + "\n";
        }
        return resultado;
    }  
}
