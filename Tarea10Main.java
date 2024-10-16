package tarea10main;

public class Tarea10Main {

    public static void main(String[] args) {
        System.out.println("Tarea 10");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-");
        NodoArbol<Integer> raiz = new NodoArbol<>(10, new NodoArbol<>(5, new NodoArbol<>(1), null),
        new NodoArbol<>(15, null, new NodoArbol<>(25)));
        
        System.out.println("Arbol 1");
        System.out.println(raiz);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-");
        
        NodoArbol<String> raiz2 = new NodoArbol<>("Diego", new NodoArbol<>("Pedro", new NodoArbol<>("Susan"), new NodoArbol<>("Diana")), new NodoArbol<>("Mario"));
        
        System.out.println("Arbol 2");
        System.out.println(raiz2);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-");
        
       
        
        
    }
    
}
