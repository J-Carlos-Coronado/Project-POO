package PResoluciones;


// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022
/**
 * Class ResolucionHD
 */
//Clase ResolucionHD es una clase hija de Resolucion 
public class ResolucionHD extends Resolucion {

  //
  // Fields
  //
  // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
    protected final static double LARGO = 720;
    protected final static double ANCHO = 1280;
  
  //
  // Constructors
  //
  //Herrera improvement public ResolucionHD () { };}
  //En este apartado se crea el constructor Resolucion hd y super toma los parametros Largo y ancho 
	public ResolucionHD(){
        super(LARGO,ANCHO);
    }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
//Cierre de la clase y del metodo
