
package PResoluciones;
// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
// @author:Alejandro Espinoza  (Coder)
//@version: 24/05/2022



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ResolucionDatos {
    //En este apartado invocamos el archivo de texto que contiene las resoluciones soportadas  para que el usuario lo pueda ver 
    public static String direcFile = "src\\PResoluciones\\ResolucionSoportadas.txt";
    
    // Leemos el archivo  a traves de un Arraylist 
    //si el archivo es encontrado lo muestra, de lo contrario manda un error
    public static ArrayList leerArchivo(){ 
        File archivo = new File(direcFile);
        ArrayList<String> resoluciones = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                resoluciones.add(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println(resoluciones);
        return resoluciones;
    }
    
     //Campos de la clase

}//Cierre del método
