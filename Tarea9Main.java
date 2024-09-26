package tarea9main;

public class Tarea9Main {

    public static void main(String[] args) {
        System.out.println("Tarea 9");
        System.out.println("Evaluacion de balanceo de parentesis y llaves");
        System.out.println("--------------------------------");
        String[] lineasEntrada = {
            "Ho(la co){mo estas }[]",
            "{[(8+9)*(5-7)]/2",
            "{[(8+9)*(5-7)]/2}",
            "Marry me(Juliet) you{ne}ver h[a]ve to b{alone}",
            "{}()[]",
            "{[(",
        };
    
        Verificador verificador = new Verificador();
        
        for (String linea : lineasEntrada) {
            boolean resultado = verificador.estaBalanceado(linea);
            System.out.println("Linea: " + linea + " - Esta balanceado? " + (resultado ? "Si" : "No"));            
        }
    } 
}
