package tarea3main;

public class Tarea3Main {
    public static void main(String[] args) {
        NodoTarea3<Integer> head = new NodoTarea3<>();
        head.setDato(100);
        
        System.out.println("Tarea 3");
        System.out.println("---------------------");
        
        //Creación de la estructura
        NodoTarea3<Integer> head2 = new NodoTarea3<>(100, new NodoTarea3<>(200, new NodoTarea3<>(300, new NodoTarea3<>(400, new NodoTarea3<>(600)))));
        
        //Para imprimir la estructura
        NodoTarea3<Integer> aux = head2;
        System.out.print("|");
        while(aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");
        
        //Para modificar el dato de 300 por 333
        head2.getSiguiente().getSiguiente().setDato(333);
        
        //Para imprimir la estructura con la modificación 1
        NodoTarea3<Integer> aux1 = head2;
        System.out.println();
        System.out.print("|");
        while(aux1 != null){
            System.out.print(aux1.getDato() + "| -> |");
            aux1 = aux1.getSiguiente();
        }
        System.out.println("null|");
        
        //Para insertar un nodo 700 al final
        head2.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new NodoTarea3<>(700));
        
        //Para imprimir la modificación 2
        NodoTarea3<Integer> aux2 = head2;
        System.out.print("|");
        while(aux2 != null){
            System.out.print(aux2.getDato() + "| -> |");
            aux2 = aux2.getSiguiente();
        }
        System.out.println("null|");
        
        //Para insertar un nuevo nodo con valor de 50 al principio
        //Primero creamos el nuevo nodo
        NodoTarea3<Integer> nuevoNodo = new NodoTarea3<>(50);
        //Después hacemos que el nuevo nodo apunte al anterior nodo
        nuevoNodo.setSiguiente(head2);
        //Actualizamos head2
        head2 = nuevoNodo;
        
        //Para imprimir la modificación 3
        NodoTarea3<Integer> aux3 = head2;
        System.out.print("|");
        while(aux3 != null){
            System.out.print(aux3.getDato() + "| -> |");
            aux3 = aux3.getSiguiente();
        }
        System.out.println("null|");
    }
}
