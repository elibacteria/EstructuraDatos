package com.mycompany.tarea1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LectorCsv {
    
    private BufferedReader lector; //lee el archivo csv
    private String linea; //recibe las lineas de cadas fila
    private List<String[]> datos = new ArrayList<>();
    
    //Declaramos dos métodos
    public void leerArchivo(String nombreArchivo){
        try{
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
            if(inputStream == null){
                System.out.println("No se encontró el archivo: " + nombreArchivo);
                return;
            }
            lector = new BufferedReader(new InputStreamReader(inputStream));
            while ((linea = lector.readLine()) != null){
                String[] partes = linea.split(",");
                datos.add(partes);
            }
            lector.close();
            calcularDatos();
        }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void calcularDatos(){
        double suma = 0;
        int count = 0;
        //Para calcular la diferencia de followers en twitter entre enero y junio
        if(datos.size() > 8 && datos.get(8).length > 8){ 
            double diferencia1 = Math.abs(Double.parseDouble(datos.get(8)[3]) - Double.parseDouble(datos.get(8)[8]));
            System.out.println("Diferencia de followers en Twitter entre el mes de enero y junio: " + diferencia1);
        }
        
        //Para calcular la diferencia de visualizaciones de youtube entre enero y junio
        if(datos.size() > 16 && datos.get(16).length > 8){
            double diferencia2 = Math.abs(Double.parseDouble(datos.get(16)[3]) - Double.parseDouble(datos.get(16)[8]));
            System.out.println("Diferencia de visualizaciones de Youtube entre enero y junio: " + diferencia2);
        }
        
        //Para calcular el promedio de crecimiento entre los meses enero a junio de twitter y facebook
        if(datos.size() > 9 && datos.get(2).length > 8 && datos.get(9).length > 8){
            double sumaTotal = 0;
            int contador = 0;
            
            //De la columna 3 a la 8, fila 2
            for (int i = 3; i <= 8; i++) {
                sumaTotal += Double.parseDouble(datos.get(2)[i]);
                contador++;
            }
            
            //De la columna 3 a la 8, fila 9
            for (int i = 3; i <= 8; i++) {
                sumaTotal += Double.parseDouble(datos.get(9)[i]);
                contador++;
            }
            
            double promedioTotal = sumaTotal / contador;
            System.out.println("Promedio de crecimiento de Twitter y Facebook entre los meses de enero y junio: " + promedioTotal);
        }else{
            System.out.println("Error");
        }
        
        //Para calcular el promedio de me gusta entre enero y junio de facebook, youtube y twitter
        if(datos.size() > 18 && datos.get(5).length > 8 && datos.get(13).length > 8 && datos.get(18).length > 8){
            double sumaTotal = 0;
            int contador = 0;
            
            //De la columna 3 a la 8, fila 5
            for (int i = 3; i <= 8; i++) {
                sumaTotal += Double.parseDouble(datos.get(5)[i]);
                contador++;
            }
            
            //De la columna 3 a la 8, fila 13
            for (int i = 3; i <= 8; i++) {
                sumaTotal += Double.parseDouble(datos.get(13)[i]);
                contador++;
            }
            
            //De la columna 3 a la 8, fila 18
            for (int i = 3; i <= 8; i++) {
                sumaTotal += Double.parseDouble(datos.get(18)[i]);
                contador++;
            }
            
            double promedioTotal = sumaTotal / contador;
            System.out.println("Promedio de MeGusta de Twitter y Facebook entre los meses de enero y junio: " + promedioTotal);
        }else{
            System.out.println("Error");
        }
    }
}
