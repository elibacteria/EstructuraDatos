package proyectofinaleddmain;

import java.util.Scanner;

public class ProyectoFinalEddMain {

    public static void main(String[] args) {
        //Ventana v = new Ventana();
        ArbolBinarioBusqueda<Producto> inventario = new ArbolBinarioBusqueda<>();
        Scanner scanner = new Scanner(System.in);
        
        inventario.insertar(new Producto("Agar Papa Dextrosa", 100, 299.0, 10));
        inventario.insertar(new Producto("Agar Sangre", 101, 388.19, 10));
        inventario.insertar(new Producto("Agar Chocolate", 200, 1944.47, 5));
        inventario.insertar(new Producto("Agar MacConkey", 300, 149.33, 3));
        inventario.insertar(new Producto("Caldo Lactosado", 500, 1630.15, 15));
        inventario.insertar(new Producto("Caldo Rappaport Vassiliadis", 700, 3159.84, 4));
        inventario.insertar(new Producto("Caldo Nutritivo", 501, 2021.01, 6));
        inventario.insertar(new Producto("Agar Soya Tripticaseina", 102, 246.67, 9));
        inventario.insertar(new Producto("Caldo Tioglicolato", 600, 2221.11, 13));
        inventario.insertar(new Producto("Agar Sal y Manitol", 301, 644.21, 2));
    
        while (true) {
            try {
                System.out.println("-----Sistema de Gestion de Inventario del Laboratorio de Microbiologia Biotekax-----");
                System.out.println("1. Listar inventario");
                System.out.println("2. Buscar producto");
                System.out.println("3. Agregar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");
                System.out.println("Por favor, seleccione una opcion: ");
                int opcion = Integer.parseInt(scanner.nextLine());
            
                switch (opcion) {
                    case 1:
                    listarInventario(inventario);
                        break;   
                    case 2:
                    buscarProducto(scanner, inventario);
                        break;    
                    case 3:
                    agregarProducto(scanner, inventario);
                        break;   
                    case 4:
                    eliminarProducto(scanner, inventario);
                        break;
                    case 5:
                    System.out.println("Inventario cerrado");
                        return;
                    default:
                        System.out.println("Opcion no valida. Por favor, intente de nuevo: ");
                }
            } catch (NumberFormatException e){
                System.out.println("Opcion no valida. Por favor, intente de nuevo: ");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    private static void listarInventario(ArbolBinarioBusqueda<Producto> inventario){
        System.out.println("El inventario es: ");
        inventario.recorrerEnOrden();
    }
    
    private static void buscarProducto(Scanner scanner, ArbolBinarioBusqueda<Producto> inventario){
        try {
            System.out.println("Ingrese el ID del producto que quieras buscar: ");
            int idBuscar = Integer.parseInt(scanner.nextLine());
            
            Producto productoBuscar = new Producto("", idBuscar, 0 , 0);
            Producto encontrado = inventario.buscar(productoBuscar);
            if (encontrado != null) {
                System.out.println("Producto encontrado: " + encontrado);
            } else {
                System.out.println("Producto no encontrado");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un ID valido");
        }
    }
    
    private static void agregarProducto(Scanner scanner, ArbolBinarioBusqueda<Producto> inventario) {
        try {
            System.out.println("Nombre del producto: ");
            String nombre = scanner.nextLine();
            
            System.out.println("ID del producto: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Cantidad en stock: ");
            int cantidadInventario = Integer.parseInt(scanner.nextLine());
            
            if (precio < 0 || cantidadInventario < 0) {
                System.out.println("El valor debe ser mayor a 0");
                return;   
            }
            
            Producto producto = new Producto(nombre, id, precio, cantidadInventario);
            inventario.insertar(producto);
            System.out.println("El producto se agrego correctamente");
        } catch (NumberFormatException e ){
            System.out.println("Error. Por favor ingrese datos validos");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void eliminarProducto(Scanner scanner, ArbolBinarioBusqueda<Producto> inventario){
        try {
            System.out.println("Ingrese el ID del producto que quieras eliminar: ");
            int idEliminar = Integer.parseInt(scanner.nextLine());
            
            Producto productoEliminar = new Producto("", idEliminar, 0, 0);
            inventario.eliminar(productoEliminar);
            System.out.println("El producto se elimino correctamente");
        } catch (NumberFormatException e){
            System.out.println("Error: Por favor, ingrese un ID valido");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}