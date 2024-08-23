package tarea2;

import java.util.List;

public class Tarea2 {

    public static void main(String[] args) {
        ConjuntoADT conjunto1 = new ConjuntoADT();
        ConjuntoADT conjunto2 = new ConjuntoADT();

        System.out.println("Tarea 2");
        System.out.println("-------------------------");
        
        //Para crear el primer conjunto
        List<String> lista1 = List.of("Amy", "Ander", "Elizabeth", "Any", "Isaac", "Amy");
        for (String item: lista1){
            conjunto1.agregar(item);
        }
        System.out.println("El conjunto 1 es: " + conjunto1.toString());
        
        //Para crear el segundo conjunto
        List<String> lista2 = List.of("Aaron", "Lucio", "Erick", "Paulo", "Esteban", "Ander");
        for (String item: lista2){
            conjunto2.agregar(item);
        }
        System.out.println("El conjunto 2 es: " + conjunto2.toString());

        System.out.println("------------------------");

        

        System.out.print("El conjunto 1 tiene: " + conjunto1.longitud() + " elementos");
        System.out.println();
        System.out.print("El conjunto 2 tiene: " + conjunto2.longitud() + " elementos");
        System.out.println();
        System.out.println("------------------------");
        
        System.out.println("La union de los dos conjuntos es: " + conjunto1.union(conjunto2).toString());
        System.out.println("La interseccion de los dos conjuntos es: " + conjunto1.interseccion(conjunto2).toString());
        
        System.out.println("-------------------------");

        System.out.println("La diferencia del conjunto 1 y el 2 es: " + conjunto1.diferencia(conjunto2).toString());
        System.out.println("La diferencia del conjunto 2 y el 1 es: " + conjunto2.diferencia(conjunto1).toString());

        System.out.println("-----------------------");
        
        //Para agregar elementos al conjunto 1
        List<String> lista3 = List.of("Laura", "Axel");
        for (String item: lista3){
            conjunto1.agregar(item);
        }
        System.out.println("El nuevo conjunto 1 es: " + conjunto1.toString());
        
        //Para eliminar elementos del conjunto 2
        List<String> lista4 = List.of("Lucio", "Paulo");
        for (String item: lista4){
            conjunto2.eliminar(item);
        }
        System.out.println("El nuevo conjunto 2 es: " + conjunto2.toString());

        System.out.println("-----------------------");

        //Para comprobar si un elemento pertenece al conjunto 1
        String nombre1 = "Enrique";
        String nombre2 = "Esteban";
      
        if (conjunto1.contiene(nombre1)){
            System.out.println(nombre1 + " pertecene al conjunto 1");
        }else{
            System.out.println(nombre1 + " no pertenece al conjunto 1");
        }

        if (conjunto1.contiene(nombre2)){
            System.out.println(nombre2 + " pertenece al conjunto 1");
        }else {
            System.out.println(nombre2 + " no pertenece al conjunto 1");
        }
        
        //Para comprobar si un elemento pertecene al conjunto 2
        if (conjunto2.contiene(nombre1)){
            System.out.println(nombre1 + " pertenece al conjunto 2");
        }else{
            System.out.println(nombre1 + " no pertenece al conjunto 2");
        }

        if (conjunto2.contiene(nombre2)){
            System.out.println(nombre2 + " pertenece al conjunto 2");
        }else{
            System.out.println(nombre2 + "no pertecene al conjunto 2");
        }

        System.out.println("-----------------------");
        
        //Para saber si el conjunto 1 es igual al conjunto 2
        if (conjunto1.equals(conjunto2)){
            System.out.println("El conjunto 1 es igual al conjunto 2");
        }else{
            System.out.println("El conjunto 1 no es igual al conjunto 2");
        }

        System.out.println("-------------------------");
        
        //Para saber si un conjunto es subconjunto del otro conjunto

        if (conjunto1.esSubConjunto(conjunto2)){
            System.out.println("El conjunto 1 es subconjunto del 2");
        }else{
            System.out.println("El conjunto 1 no es subconjunto de 2");
        }

        System.out.println();

        if (conjunto2.esSubConjunto(conjunto1)){
            System.out.println("El conjunto 2 es subconjunto del 1");
        }else{
            System.out.println("El conjunto 2 no es subconjunto del 1");
        }

        System.out.println("--------------------------");
    }
}