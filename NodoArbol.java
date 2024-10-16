package tarea10main;

import java.util.Objects;

public class NodoArbol<T> {
    private T dato;
    private NodoArbol<T> hijoIzquierdo;
    private NodoArbol<T> hijoDerecho;
    
    public NodoArbol(){
        
    }
    
    public NodoArbol(T dato){
        this.dato = dato;
    }

    public NodoArbol(T dato, NodoArbol<T> hijoIzquierdo, NodoArbol<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public NodoArbol<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public NodoArbol<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodoArbol<?> other = (NodoArbol<?>) obj;
        return Objects.equals(this.dato, other.dato);
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "dato=" + dato + ", hijoIzquierdo=" + hijoIzquierdo + ", hijoDerecho=" + hijoDerecho + '}';
    }
    
    
    
    
    



    
    
    
    
}
