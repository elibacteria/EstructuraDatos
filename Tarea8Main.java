package tarea8main;

public class Tarea8Main {

   public static void main(String[] args) {
       System.out.println("Tarea 8");
       System.out.println("-----------------------------------");
       System.out.println("Sistema de Clientes del Banco Maze Bank");
       System.out.println();
       
       //Creamos la cola con prioridad acotada
       ColaConPrioridadAcotada<ClienteBanco> clientesBanco = new ColaConPrioridadAcotada<>(5);
       clientesBanco.encolar(4, new ClienteBanco("Daniel Teran Herrera", "12893839", "San Luis Ayucan Mz67 L21", "558373737", 4, 8500));
       clientesBanco.encolar(4, new ClienteBanco("Joana Itzel Perez Gonzalez", "2647295264", "Cuajimalpa num 34", "4624738322", 4, 17300));
       clientesBanco.encolar(5, new ClienteBanco("Daniel Isaac Gordillo Hernandez", "7586254", "Muzquiz num 11", "8383422861", 5, 0));
       clientesBanco.encolar(5, new ClienteBanco("Ander Santiago Martinez Gonzalez", "812345678", "Las Americas num 666", "98765432", 5, 0));
       clientesBanco.encolar(5, new ClienteBanco("Amy Cardenas Silva", "2536633623", "Lago de Chalco num 9", "8721020001", 5, 0));
       clientesBanco.encolar(1, new ClienteBanco("Taylor Swift", "6462747272", "Kansas City num 87", "16266273", 1, 500000000));
       System.out.println("El estado de la cola es: ");
       System.out.println(clientesBanco);
       System.out.println();
       System.out.println("Atendiendo al siguiente cliente...");
       System.out.println("Realizando retiro de $10,000");
       clientesBanco.desEncolar().retirarDinero(10000);
       System.out.println();
       clientesBanco.encolar(3, new ClienteBanco("Francisco Cruz Ocampo", "1638822345", "Constitucion de 1917 num 53", "551273437", 3, 70000));
       clientesBanco.encolar(2, new ClienteBanco("Alex Santos Barrera", "1746278281", "Cto de los Patos 81D", "1726319127", 2, 3000000));
       System.out.println("El estado de la cola es: ");
       System.out.println(clientesBanco);
       System.out.println("Atendiendo al siguiente cliente...");
       clientesBanco.desEncolar();
       System.out.println();
       System.out.println("El estado de la cola es: ");
       System.out.println(clientesBanco);
       System.out.println();
       System.out.println("Atendiendo clientes restantes...");
       while(!clientesBanco.estaVacia()){
           if(clientesBanco.desEncolar() != null){
               clientesBanco.desEncolar();
           }
       }
       System.out.println("El estado de la cola es: ");
       System.out.println(clientesBanco);
       
       
        
    }
    
}
