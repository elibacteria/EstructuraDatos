package tarea2;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoADT<T> {
    private final Set<T> conjunto;
    public ConjuntoADT(){
        conjunto = new HashSet<>();
    }

    public int longitud(){
        return conjunto.size();
    }

    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    public void agregar(T elemento){
        if(conjunto.contains(elemento) == false) {
            conjunto.add(elemento);
        }else{
            System.out.println(elemento + " ya pertenece al conjunto, no se puede volver a agregar");
        }
    }

    public void eliminar(T elemento){
        if (conjunto.contains(elemento) == true){
            conjunto.remove(elemento);
        }else{
            System.out.println(elemento + " ya no pertenece al conjunto");
        }
    }

    public boolean equals(ConjuntoADT<T> otroConjunto){
        return conjunto.equals(otroConjunto.conjunto);
    }

    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto) {
        return otroConjunto.conjunto.containsAll(conjunto);
    }

    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto){
        ConjuntoADT u = new ConjuntoADT<>();
        u.conjunto.addAll(this.conjunto);
        u.conjunto.addAll(otroConjunto.conjunto);
        return u;
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> i = new ConjuntoADT<>();
        i.conjunto.addAll(this.conjunto);
        i.conjunto.retainAll(otroConjunto.conjunto);
        return i;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> d = new ConjuntoADT<>();
        d.conjunto.addAll(this.conjunto);
        d.conjunto.removeAll(otroConjunto.conjunto);
        return d;
    }

    @Override
    public String toString(){
        return conjunto.toString();
    }
}