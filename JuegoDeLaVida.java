package tarea6main;

public class JuegoDeLaVida {
    private Array2d rejilla;
    private int ren;
    private int col;
    
    public Array2d getCeldas(){
        return rejilla;
    }
    
    public void setCeldas(Array2d celdas){
        this.rejilla = celdas;
    }
    
    public int getCol(){
        return col;
    }
    
    public void setCol(int col){
        this.col = col;
    }
    
    public int getRow(){
        return ren;
    }
    
    public void setRow(int row){
        this.ren = row;
    }
    
    public JuegoDeLaVida(){
        this.col = 0;
        this.ren = 0;
        this.rejilla = null;
    }
    
    public JuegoDeLaVida(int renglones, int columnas){
        this.ren = renglones;
        this.col = columnas;
        this.rejilla = new Array2d(renglones, columnas);
        rejilla.clear('M');
    }
    
    public void setCelula(int renglon, int columna, char estado){
        if(estado == 'V'){
            rejilla.setItem(renglon, columna, 'V');
        }else{
            rejilla.setItem(renglon, columna, 'M');
        }
    }
    
    public char getCelula(int renglon, int columna){
        return this.rejilla.getItem(renglon, columna);
    }
    
    public void imprimirRejilla(){
        for (int i = 0; i < rejilla.getRowSize(); i++) {
            for (int j = 0; j < rejilla.getColSize(); j++) {
                if(getCelula(i, j) == 'V'){
                    System.out.print("" + '1' + "");
                }else{
                    System.out.print("" + '0' + "");
                }
            }
            System.out.println("");
        }
    }
    
    public int contadorVecinos(int renglon, int columna){
        int contador = 0;
        for (int i = renglon - 1; i <= renglon + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if((i == renglon && j == columna) || i < 0 || j < 0 || i >=this.ren || j >= this.ren){
                    continue;
                }else{
                    if(getCelula(i, j) == 'V'){
                        contador++;
                    }
                }   
            }   
        }
        return contador;
    }
    
    public void siguienteGeneracion() {
        System.out.println("--------------------------------------------");
        System.out.println("Siguiente generacion: ");
        
        Array2d nuevaRejilla = new Array2d(this.ren,this.col);
        nuevaRejilla.clear('M');
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                int vecinos = contadorVecinos(i,j);
                if (getCelula(i,j) == 'V'){
                    if(vecinos < 2 || vecinos > 3){
                        nuevaRejilla.setItem(i,j,'M');
                    }else{
                        nuevaRejilla.setItem(i,j,'V');                    }
                }else{
                    if (vecinos == 3){
                        nuevaRejilla.setItem(i,j,'V');
                    }else{
                        nuevaRejilla.setItem(i,j,'M');
                    }
                }
            }
        }
        this.rejilla = nuevaRejilla;
    }
}
