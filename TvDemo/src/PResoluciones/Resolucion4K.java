package PResoluciones;
// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022
//4k res = 3840 x 2160
/**
 * Class ResolucionHD
 */
//Clase Resolucion4k es una clase hija de Resolucion 
public class Resolucion4K extends Resolucion {
    // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
    protected final static double LARGO = 2160;
    protected final static double ANCHO = 3840;
    // Creacion del constructor Resolucion 4k que nos dara una mejor visivilidad en la tv 
    //Super toma como parametros el largo y el ancho 
    public Resolucion4K(){
        super(LARGO,ANCHO);
    }
}//Cierre de la clase y del metodo




