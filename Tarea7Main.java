package tarea7main;

public class Tarea7Main {

    public static void main(String[] args) {
        System.out.println("Tarea 7");
        System.out.println("-------------------------");
        System.out.println("Clinica de la salud Kopay");
        System.out.println("Pacientes 20/09/2024");
        System.out.println();
        
        //Se crea una cola para pacientes de una clinica medica
        ColaADT<Paciente> pacientes = new ColaADT<>();
        pacientes.encolar(new Paciente("Alex Santos Barrera", 27, "Cto de los Patos 81D", "5525774728", 1));
        pacientes.encolar(new Paciente("Amy Cardenas Silva", 19, "Lago de Chalco num 9", "55579193729", 3));
        pacientes.encolar(new Paciente("Ander Santiago Martinez Gonzalez", 24, "Las Americas num 67", "55182930133", 2));
        System.out.println("La cola de pacientes es: ");
        System.out.println(pacientes);
        System.out.println("El paciente que sigue es: ");
        System.out.println(pacientes.frente());
        System.out.println();
        System.out.println("Atendiendo paciente...");
        System.out.println();
        pacientes.desEncolar();
        System.out.println("La cola de pacientes es: ");
        System.out.println(pacientes);
        pacientes.encolar(new Paciente("Samuel Alexis Guerrero Hernadez", 27, "Azucena num 9", "55191919122", 5));
        pacientes.encolar(new Paciente("Monica Laguna Velasco", 23, "Jalpa de Mendez M29 L8", "551747534728", 1));
        System.out.println("La cola de pacientes es: ");
        System.out.println(pacientes);
        System.out.println();
        System.out.println("Atendiendo paciente...");
        System.out.println();
        pacientes.desEncolar();
        System.out.println("La cola de pacientes es: ");
        System.out.println(pacientes);
    }
    
}
