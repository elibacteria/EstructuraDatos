package tarea3main;

public class NodoTarea3<T> {
    private T dato;
    private NodoTarea3<T> siguiente;
    
    public NodoTarea3(){
    }
    
    public NodoTarea3(T dato){
        this.dato = dato;
    }
    
    public NodoTarea3(T dato, NodoTarea3<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setDato (T dato){
        this.dato = dato;
    }
    
    public NodoTarea3<T> getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(NodoTarea3<T> siguiente){
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return "Nodo{" +
                "dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }  
}
