package tarea9main;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> data;
    
    public Stack(){
        data = new ArrayList<>();
    }
    
    public boolean estaVacia(){
        return data.isEmpty();
    }
    
    public int length(){
        return data.size();
    }
    
    public T pop(){
        if(estaVacia()) {
            System.out.println("La pila esta vacia");
            return null;
        }
        return data.remove(data.size() - 1);
    }
    
    public T peek(){
        if(estaVacia()){
            System.out.println("La pila esta vacia");
            return null;
        }
        return data.get(data.size() - 1);
    }
    
    public void push(T value){
        data.add(value);
    }

    @Override
    public String toString() {
        String info = "------\n";
        for (int i = data.size() - 1; i >= 0; i--) {
            info += data.get(i) + "\n|---|\n";
        }
        return info;
    }
}
