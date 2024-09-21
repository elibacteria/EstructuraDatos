package tarea7main;

public class Paciente {
    
    //Definimos atributos
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private int numeroDeVisita;
    
    //Constructores
    public Paciente(){
        this.nombre = null;
        this.edad = -1;
        this.direccion = null;
        this.telefono = null;
        this.numeroDeVisita = -1;
    }
    
    //Sobrecargado
    public Paciente(String nombre, int edad, String direccion, String telefono, int numeroDeVisita){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroDeVisita = numeroDeVisita;
    }
    
    //Gets and Sets
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
   
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroDeVisita() {
        return numeroDeVisita;
    }
    
    public void setNumeroDeVisita(int numeroDeVisita) {
        this.numeroDeVisita = numeroDeVisita;
    }
    
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroDeVisita=" + numeroDeVisita +
                '}';
    }
}
