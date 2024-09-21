package tarea8main;

public class ClienteBanco{
    
    //Definimos atributos
    private String nombre;
    private String numCuenta;
    private String direccion;
    private String telefono;
    private int nivelDeCliente;
    private double credito;
    
    //Constructores
    public ClienteBanco(){
        this.nombre = null;
        this.numCuenta = null;
        this.direccion = null;
        this.telefono = null;
        this.nivelDeCliente = -1;
        this.credito = 0.0;
    }
    
    //Sobrecargado
    public ClienteBanco(String nombre, String numCuenta, String direccion, String telefono, int nivelDeCliente, double credito){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nivelDeCliente = nivelDeCliente;
        this.credito = credito;
    }
    
    //Gets and Sets
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNumCuenta(){
        return numCuenta;
    }
   
    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
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

    public int getNivelDeCliente() {
        return nivelDeCliente;
    }
    
    public void setNivelDeCliente(int nivelDeCliente) {
        this.nivelDeCliente = nivelDeCliente;
    }
    
    public double getCredito() {
        return credito;
    }
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    //Metodos
    public boolean retirarDinero(double cantidad){
        if(cantidad > 0 && cantidad <= credito){
            credito -= cantidad;
            System.out.println("Se retiraron $" + cantidad + ". Credito restante: $" + credito);
            return true;
        } else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }
    
    public void depositarDinero(double cantidad){
        if(cantidad > 0) {
            credito += cantidad;
            System.out.println("Se depositaron $" + cantidad + ". Credito actual: $" + credito);
        } else {
            System.out.println("Cantidad no valida");
        }
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numCuenta=" + numCuenta +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nivelDeCliente=" + nivelDeCliente +
                ", credito=" + credito +
                '}';
    }
}

    

