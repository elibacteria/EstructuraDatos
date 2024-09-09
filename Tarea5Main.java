package tarea5main;

public class Tarea5Main {

   public static void main(String[] args) {
       System.out.println("Tarea 5");
       System.out.println("-----------------------------------------");
       DoubleLinkedList<Integer> numeros = new DoubleLinkedList<>();
       numeros.agregarAlInicio(50);
       numeros.agregarAlFinal(60);
       numeros.agregarAlFinal(65);
       numeros.agregarAlFinal(70);
       numeros.agregarAlFinal(80);
       numeros.agregarAlFinal(90);
       numeros.transversal(0);
       numeros.eliminar(2);
       numeros.transversal(0);
       numeros.actualizarValorDePosicion(4, 88);
       numeros.transversal(0);
       numeros.buscarElemento(80);
    }
    
}
