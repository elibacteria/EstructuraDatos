package tarea11main;

public class Tarea11Main {
    
    //Metodo de contador regresivo
    public static void contadorRegresivo(int n){
        if(n < 0 ){
            return;
        }
        System.out.println(n);
        contadorRegresivo(n - 1); 
    }
    
    //Metodo para extraer valor de la posicion media de una pila
    public static <T> T obtenerMedio(Stack<T> pila, int contador){
       if (contador == 1){
           return pila.pop();
       }
       T auxiliar = pila.pop();
       T medio = obtenerMedio(pila, contador - 1);
       pila.push(auxiliar);
       return medio;  
    }

    public static void main(String[] args) {
        System.out.println("Tarea 11");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("Contador regresivo");
        contadorRegresivo(10);
        
        Stack<Integer> pila = new Stack<>();
        pila.push(11);
        pila.push(3);
        pila.push(8);
        pila.push(17);
        pila.push(29);
        pila.push(66);
        pila.push(51);
        
        System.out.println();
        System.out.println("Valor medio de una pila");
        System.out.println("La pila es: ");
        System.out.println(pila);
        
        int contador = (pila.length() + 1) / 2;
        Integer valorMedio = obtenerMedio(pila, contador);
        
        System.out.println("El valor de la posicion media es: " + valorMedio);
    } 
}
