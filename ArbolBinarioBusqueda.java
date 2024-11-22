package proyectofinaleddmain;

import java.util.ArrayList;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    
    private NodoArbolBinario<T> raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }


    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoArbolBinario<T> insertarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            return new NodoArbolBinario<>(valor);
        }
        if(valor.compareTo(nodo.getData()) == 0) return  nodo;
        if (valor.compareTo(nodo.getData()) < 0) {
            nodo.setHijoIzquierdo(insertarRecursivo(nodo.getHijoIzquierdo(), valor));
        } else if (valor.compareTo(nodo.getData()) > 0) {
            nodo.setHijoDerecho(insertarRecursivo(nodo.getHijoDerecho(), valor));
        }
        return nodo; // No duplicados
    }


    public T buscar(T valor) {
        return buscarRecursivo(raiz, valor);
    }

    private T buscarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            return null;
        }
        if (valor.compareTo(nodo.getData()) == 0) {
            return nodo.getData();
        }
        if(valor.compareTo(nodo.getData()) < 0){
            return buscarRecursivo(nodo.getHijoIzquierdo(), valor);
        }
        else {
            return buscarRecursivo(nodo.getHijoDerecho(), valor);
        }
        
    }
    /*public String buscar2(T valor){
        return buscar2Recursivo(raiz, valor);
    }
    
    private String buscar2Recursivo(NodoArbolBinario<T> nodo, T valor){
        if (nodo == null) {
            return "No se encontro el producto";
        }
        if(valor.compareTo(nodo.getData()) < 0){
            return buscar2Recursivo(nodo.getHijoIzquierdo(), valor);
        }
        if(valor.compareTo(nodo.getData()) > 0){
            return buscar2Recursivo(nodo.getHijoDerecho(), valor);
        }
        return nodo.getData().toString();
    }
    */
    
    
    //Para recorrer en orden
    public void recorrerEnOrden() {
        recorrerEnOrdenRecursivo(raiz);
        System.out.println();
    }

    private void recorrerEnOrdenRecursivo(NodoArbolBinario<T> nodo) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.getHijoIzquierdo());
            System.out.println(nodo.getData() + " ");
            recorrerEnOrdenRecursivo(nodo.getHijoDerecho());
        }
    }
    
    //Para recorrer pre orden
    public String recorrerPreOrden() {
        ArrayList lista = new ArrayList();
        String listString = String.join("\n", recorrerPreOrdenRecursivo(raiz, lista));
        return listString;
        //System.out.println();
    }
    
    private ArrayList recorrerPreOrdenRecursivo(NodoArbolBinario<T> nodo, ArrayList lista) {
        if (nodo != null) {
            lista.add(nodo.getData().toString());
            recorrerPreOrdenRecursivo(nodo.getHijoIzquierdo(), lista);
            recorrerPreOrdenRecursivo(nodo.getHijoDerecho(), lista);
        }
        return lista;
    }
    
    //Para recorrer pos orden
    public String recorrerPosOrden(){
        ArrayList lista = new ArrayList();
        String listString = String.join("\n", recorrerPreOrdenRecursivo(raiz, lista));
        return listString;
        //System.out.println();
    }
    
    private ArrayList recorrerPosOrdenRecursivo(NodoArbolBinario<T> nodo, ArrayList lista){
       if (nodo != null) {
            recorrerPosOrdenRecursivo(nodo.getHijoIzquierdo(), lista);
            recorrerPosOrdenRecursivo(nodo.getHijoDerecho(), lista);
            lista.add(nodo.getData().toString());
        }
        return lista; 
    }
    
    //Para eliminar valores
    public void eliminar(T valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private NodoArbolBinario<T> eliminarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            return null;
        }

        if (valor.compareTo(nodo.getData()) < 0) {
            nodo.setHijoIzquierdo(eliminarRecursivo(nodo.getHijoIzquierdo(), valor));
        } else if (valor.compareTo(nodo.getData()) > 0) {
            nodo.setHijoDerecho(eliminarRecursivo(nodo.getHijoDerecho(), valor));
        } else {
            //encontrado
            if (nodo.getHijoIzquierdo() == null) {
                return nodo.getHijoDerecho();
            } else if (nodo.getHijoDerecho() == null) {
                return nodo.getHijoIzquierdo();
            }

            T minValue = encontrarMinimo(nodo.getHijoDerecho());
            nodo.setData(minValue);
            nodo.setHijoDerecho(eliminarRecursivo(nodo.getHijoDerecho(), minValue));
        }
        return nodo;
    }

    private T encontrarMinimo(NodoArbolBinario<T> nodo) {
        T minValue = nodo.getData();
        while (nodo.getHijoIzquierdo() != null) {
            nodo = nodo.getHijoIzquierdo();
            minValue = nodo.getData();
        }
        return minValue;
    }
   
    @Override
    public String toString() {
        return "{" +
                "raiz=" + raiz +
                '}';
    }    
}
