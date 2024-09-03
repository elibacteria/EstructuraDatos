package tarea4main;

public class ListaLigadaSimple<T> {
    private Nodo<T> head;
    private int tamanio;
    
    public ListaLigadaSimple(){ 
    }
    
    //Método para saber si la lista está vacía
    public boolean estaVacia(){
        boolean resultado = false;
        if(this.head ==null){
            resultado = true;
        }
        return resultado;
    }
    
    //Método para saber el número de elementos de la lista
    public int getTamanio(){
        Nodo<T> aux = this.head;
        int contador = 0;
        while(aux != null){
            contador ++;
            aux = aux.getSiguiente();
        }
        return contador;
    }
    
    //Método para agregar datos al final
    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else{
            Nodo<T> aux = this.head;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    //Método para agregar datos al inicio
    public void agregarAlInicio(T dato){
        this.head = new Nodo<>(dato, this.head);
    }
    
    //Método para agregar después de un nodo de referencia
    public void agregarDespuesDe(T referencia, T dato){
        Nodo<T> auxiliar = this.head;
        
        while(auxiliar != null && !auxiliar.getDato().equals(referencia)){
            auxiliar = auxiliar.getSiguiente();
        }
        if(auxiliar != null){
            auxiliar.setSiguiente(new Nodo<T>(dato,auxiliar.getSiguiente()));
        }else{
            System.out.println("No se encontro el nodo de referencia");
        }
        
    }
    
    //Método para eliminar el elemento de cierta posición
    public void eliminarElemento(Integer posicion){
        if(posicion < 0 || posicion >= getTamanio()){
            System.out.println("Posición inválida");
        }
        
        if(posicion == 0){
            this.head = this.head.getSiguiente();
        }else{
            Nodo<T> aux = this.head;
            for (int i = 0; i < posicion - 1; i++) {
                aux = aux.getSiguiente();   
            }
            Nodo<T> nodoAEliminar = aux.getSiguiente();
            aux.setSiguiente(nodoAEliminar.getSiguiente());
        }
        tamanio--;
    }
    
    //Método para eliminar el primero de la lista
    public void eliminarPrimero(){
        this.head = this.head.getSiguiente();
    }
    
    //Método para eliminar el último de la lista
    public void eliminarUltimo(){
        Nodo<T> auxiliar = this.head;
        if(getTamanio() < 1){
            while(auxiliar.getSiguiente().getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(null);
        }else{
            this.head = null;
        }
    }
    
    //Método para buscar un elemento en la lista y regresar la posición en la que se encuentra
    public int buscar(T valor){
        if(estaVacia() == true){
            return -1;
        }
        Nodo<T> auxiliar = this.head;
        int contador = 0;
        while(auxiliar.getDato() != valor){
            auxiliar =auxiliar.getSiguiente();
            contador ++;
        }
        return contador;
    }
    
    //Método para actualizar un valor
    public void actualizar(T aBuscar, T dato){
        Nodo<T> auxiliar = this.head;
         while(auxiliar.getDato() != aBuscar){
             auxiliar = auxiliar.getSiguiente();
         }
         auxiliar.setDato(dato);
    }
   
    //Método para hacer un recorrido transversal y mostrar todos los elementos
    public void transversal(){
        Nodo<T> aux = this.head;
        while(aux != null){
            System.out.println(aux.getDato() + " --> ");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }
   
}
