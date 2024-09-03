package tarea4main;

public class Tarea4Main {
    public static void main(String[] args) {
        System.out.println("Tarea 4");
        System.out.println("-----------------------------------------");
        
        SmartPhone smartphone1 = new SmartPhone("Apple", "iPhone 15 Pro", "iOS 17", "Titanio blanco");
        ListaLigadaSimple<SmartPhone> smartphones = new ListaLigadaSimple<>();
      
        smartphones.agregarAlFinal(smartphone1);
        smartphones.agregarAlFinal(new SmartPhone("Samsung", "Galaxy S23 Ultra", "Android 13", "Menta"));
        smartphones.agregarAlFinal(new SmartPhone("Google", "Pixel 7 Pro", "Android 13", "Obsidiana"));
        smartphones.agregarAlFinal(new SmartPhone("OnePlus", "OnePlus 11", "Android 13", "Verde eterno"));
        smartphones.agregarAlFinal(new SmartPhone("Xiaomi", "Xiaomi 13 Pro", "Android 13", "Negro ceramico"));
        
        //Para imprimir la lista
        System.out.println("La lista de SmartPhones es: ");
        System.out.println();
        smartphones.transversal();
        
        //Para eliminar el de la posicion 2
        System.out.println("----------------------------------------");
        System.out.println("Lista despues de eliminar el elemento en la posicion 2: ");
        System.out.println();
        smartphones.eliminarElemento(2);
        smartphones.transversal();
        System.out.println("-----------------------------------------");
        
        /*Para actualizar el segundo elemento
        SmartPhone smartphone2 = new SmartPhone("Oppo", "Reno7", "Android 12", "Azul Aurora");
        */
        
        
        
        //Para agregar un elemento al inicio y otro al final
        smartphones.agregarAlInicio(new SmartPhone("Huawei", "Mate 50 Pro", "HarmonyOS 3", "Plata"));
        smartphones.agregarAlFinal(new SmartPhone("Sony", "Xperia 1 IV", "Android 12", "Negro"));
        System.out.println("Lista despues de actualizar el segundo elemento y con un nuevo elemento al inicio y al final: ");
        System.out.println();
        smartphones.transversal();
        System.out.println("-------------------------------------------");
        
        //Para eliminar el primero
        smartphones.eliminarPrimero();
        System.out.println("Lista despues de eliminar el primer elemento: ");
        smartphones.transversal();
        System.out.println("------------------------------------------------");
        
    }
    
}
