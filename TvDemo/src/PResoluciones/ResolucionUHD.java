package PResoluciones;

// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022
//UHD res = 1920 x 1080
/**
 * Class ResolucionHD
 */

public class ResolucionUHD extends Resolucion {
    // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla
    //Largo=1080 x ancho=1920
   protected final static double LARGO = 1080;
   protected final static double ANCHO = 1920;
   // Creacion del constructor Resolucion UHD que nos dara una mejor visivilidad en la tv 

   //Super toma como parametros el largo y el ancho 
   public ResolucionUHD(){
       super(LARGO,ANCHO);
   }
}
//Cierre de la clase y del metodo




