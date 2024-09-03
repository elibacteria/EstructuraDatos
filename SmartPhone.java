package tarea4main;

public class SmartPhone {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String color;
    
    public SmartPhone(){        
    }
    
    public SmartPhone(String marca, String modelo, String sistemaOperativo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "[ "+
                "marca: " + marca +
                ", modelo: " + modelo +
                ", sistemaOp: " + sistemaOperativo +
                ", color: " + color +
                ']';
    }
}
