package tarea8main;

import java.util.Arrays;

public class ColaConPrioridadAcotada<E> {
    private ColaADT<E> []colas;
    private int nivelCliente;
    /*
    Los niveles de cliente son:
    No es cliente: prioridad muy baja (5)
    Cliente nuevo: prioridad baja (4)
    Cliente frecuente: prioridad media (3)
    Cliente premium: prioridad alta (2)
    Celebridades: Prioridad muy alta (1)
    */
    
    public ColaConPrioridadAcotada(int nivelCliente){
        this.nivelCliente = nivelCliente;
        this.colas = new ColaADT[nivelCliente + 1];
        for (int i = 0; i < this.nivelCliente + 1; i++) {
            this.colas[i] = new ColaADT<>(); 
        }
    }
    
    public int longitud(){
        int total = 0;
        for (int i = 0; i < nivelCliente + 1; i++) {
            total += this.colas[i].longitud(); 
        }
        return total;
    }
    
    public boolean estaVacia(){
        return this.longitud() == 0;
    }
    
    public void encolar(int prioridad, E elemento){
        if(prioridad >= 1 && prioridad <= this.nivelCliente){
            this.colas[prioridad].encolar(elemento);
        }
    }
    
    public E desEncolar(){
        for (int i = 0; i <= nivelCliente; i++) {
            if(!colas[i].estaVacia()){
                return colas[i].desEncolar();
            }   
        }
        System.out.println("No hay mas elementos");
        return null;
    }
    
    @Override
    public String toString() {
        String resultado = "ColaConPrioridadAcotada: \n";
        for (int i = 1; i <= nivelCliente; i++) {
            if(!colas[i].estaVacia()){
                resultado += "Prioridad " + i + ":\n" + colas[i].toString();
            } 
        }
        return resultado;
    }
}
