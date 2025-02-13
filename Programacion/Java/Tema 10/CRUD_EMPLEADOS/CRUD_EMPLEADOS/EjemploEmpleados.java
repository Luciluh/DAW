package CRUD_EMPLEADOS;
/**
 * @author Lucia Villena Martin
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import CRUD_EMPLEADOS.clases.Empleado;



public class EjemploEmpleados {

    private static final String CARPETA_SALIDA = "datos\\" ;

    public static void main(String[] args) {

        String nombreFichero ;

        int op = 0 ;        
        ArrayList<Empleado> listado = new ArrayList<Empleado>() ;               // creamos una colección de empleados
        HashMap<String, Empleado> datos = new HashMap<String, Empleado>() ;	    // creamos una colección de empleados utilizando un HASHMAP

        // si me han pasado argumentos (nombre del fichero con los empleados)
        if (args.length > 0) {
            listado = leerListaEmpleados(args[0]) ;

            for(Empleado item : listado) {
                System.out.println(item) ;
            }

            // 1. guardar el listado en el HASHMAP (recordad que el DNI del empleado es la clave del HASHMAP)
            // 2. A la hora de guardar el listado de empleados, comprobad si existe la carpeta DATOS y, si no existe, creadla desde JAVA.
            
        }

        // rellenamos con datos de prueba
        datos.put("12345678D", new Empleado("12345678D","Irene", 900)) ;
        datos.put("12345678B", new Empleado("12345678B","Marta", 1500)) ;        
        datos.put("12345678A", new Empleado("12345678A","Paco", 1000)) ;
        datos.put("12345678C", new Empleado("12345678C","Marcos", 1250)) ;
        


        do {
            
            menu() ;
            System.out.print("Opción? ") ;
            op = Integer.parseInt(System.console().readLine()) ;

            switch(op) {

                // OPCIÓN SALIR
                case 0 : break ;

                // OPCIÓN AÑADIR
                case 1 : 
                    nuevoEmpleado(datos) ;
                    break ;

                // OPCIÓN BUSCAR
                case 2 : 
                    buscarEmpleado(datos) ;
                    break ;

                // OPCIÓN LISTAR
                case 3 : 
                    listarEmpleados(datos) ;
                    break  ;

                // OPCIÓN ?????
                case 4 : 
                    listarOrdenado(datos) ;
                    break ;

                // OPCIÓN GUARDAR LISTA DE EMPLEADOS
                case  5 : 
                    guardarListaEmpleados(datos) ;
                    break ;  


                default:
                    System.out.println("**ERROR: selecciona una opción correcta.");
            }

        } while (op!=0) ;
        
    }

    /**
     */
    private static void menu() {
        System.out.println("GESTIÓN DE EMPLEADOS:\n====================") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Añadir un empleado") ;
        System.out.println("2. Buscar empleado") ;
        System.out.println("3. Listar empleados") ;
        System.out.println("4. Listar empleados ordenados por DNI") ;
        //System.out.println("5. Leer lista de empleados") ;
        System.out.println("5. Guardar lista de empleados") ;
    }

    /**
     * @param datos
    */
    private static void nuevoEmpleado(HashMap<String, Empleado> datos) {

        int edad ;
        double salario ;

        String dni ;
        String nombre ;

        Empleado empleado ;

        System.out.println("AÑADIR EMPLEADO:\n====================");
        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;

        System.out.print("Nombre: ") ;
        nombre = System.console().readLine() ;

        System.out.print("Edad: ") ;
        edad = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Salario: ") ;
        salario = Double.parseDouble(System.console().readLine()) ;

        // creamos el empleado
        empleado = new Empleado(dni, nombre, salario) ;
        empleado.setEdad(edad) ;

        // guardamos el empleado en la colección de datos
        //datos.add(empleado) ;	// con arraylist
        datos.put(dni, empleado) ;
    }

    /**
     * @param datos
    * @return
    */
    private static void buscarEmpleado(HashMap<String, Empleado> datos) {

        String dni ;
        Empleado empleado ;
        
        System.out.println("BUSCAR EMPLEADO:\n====================");
        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;

        // mostramos el resultado
        System.out.println( datos.containsKey(dni)?datos.get(dni): "No se ha encontrado el empleado con DNI " + dni) ;

        // SÓLO ES NECESARIO CON ARRAYLIST
        // buscamos el empleado por su dni
        //empleado = buscar(dni, datos) ;

        // mostramos resultado
        //System.out.println( (empleado!=null)?empleado:"No se ha encontrado el empleado con DNI " + dni  );

    } 

    /**
     * @param dni
    * @param datos
    * @return
    */
    private static Empleado buscar(String dni, HashMap<String, Empleado> datos) {

        int i = 0 ;
        Empleado empleado = null ;

        return datos.containsKey(dni)?datos.get(dni):null ;

        /*while ((i < datos.size()) && (empleado == null)) {			
            if (datos.get(i).getDni().equals(dni)) {
                empleado = datos.get(i) ;
            } 
            
            i++ ;
        }

        return empleado ;*/
    }

    /**
     * @param datos
    */
    private static void listarEmpleados(HashMap<String, Empleado> datos) {

        System.out.println("LISTADO DE EMPLEADOS:\n====================");

        for(Entry<String, Empleado> item : datos.entrySet()) {
            System.out.println(item.getValue()) ;
            System.out.println("-----------------------------") ;
        }

    }

    /**
     * @param datos
    */
    private static void listarOrdenado(HashMap<String, Empleado> datos) {

        ArrayList<Empleado> coleccion = new ArrayList<Empleado>() ;

        // introducimos todos los valores del HashMap en un ArrayList
        coleccion.addAll(datos.values()) ;

        // ordenamos el ArrayList
        coleccion.sort(null) ; 
        
        // mostramos el ArrayList
        System.out.println("LISTADO DE EMPLEADOS ORDENADO POR DNI:\n====================");
        for(Empleado item : coleccion) {
            System.out.println(item) ;
            System.out.println("-----------------------------") ;
        }
    }

    /**
     * @param nombreFichero
    * @return
    */
    private static ArrayList<Empleado> leerListaEmpleados(String nombreFichero) {

        String[] datos ;        
        ArrayList<Empleado> listado = new ArrayList<Empleado>() ;

        try {

            FileReader archivo = new FileReader(CARPETA_SALIDA + nombreFichero + ".txt")  ;
            BufferedReader br = new BufferedReader(archivo) ;
            String linea = br.readLine() ;

            while(linea!=null) {

                // partimos por la coma los valores leídos 
                datos = linea.split(",") ;

                // guardamos el Empleado el array list
                Empleado empleado = new Empleado(datos[0], datos[1], Double.parseDouble(datos[3]) )  ;
                                empleado.setEdad( Integer.parseInt(datos[2]) ) ;

                listado.add(empleado) ;
                
                // volvemos a leer del archivo
                linea = br.readLine() ;
            }

            br.close();
            archivo.close();

        } catch(FileNotFoundException fnfe) {
            System.out.println("Se ha producido un error: no se encuentra el archivo.");
        } catch(IOException ioe) {
            System.out.println("Se ha producido un error al intentar escribir el archivo.");
        }

        return listado ;

    }

    /**
     * @param datos
    */
    private static void guardarListaEmpleados(HashMap<String, Empleado> datos) {

        String nombreFichero ;

        System.out.println("GUARDAR LISTA DE EMPLEADOS:\n====================");
        System.out.print("Fichero de salida: ") ;
        nombreFichero = System.console().readLine() ;

        try {

            FileWriter archivo = new FileWriter(CARPETA_SALIDA + nombreFichero + ".txt") ;
            BufferedWriter bw = new BufferedWriter(archivo) ;

            for(Entry<String, Empleado> item  : datos.entrySet()) {
                Empleado empleado = item.getValue() ;

                bw.write(empleado.getDni() + ",") ;
                bw.write(empleado.getNombre() + ",") ;
                bw.write(empleado.getEdad() + ",") ;
                bw.write(empleado.getSalario() + "\n") ;
            }

            bw.close() ;
            archivo.close();

        } catch(IOException ioe) {
            System.out.println("Se ha producido un error al intentar escribir el archivo.") ;
            System.out.println(ioe.getMessage()) ;
        } 
    }
    
}
