package PResoluciones;

// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022

/**
 * Class Resolucion1K
 */

//Clase Resolucion1k es una clase hija de Resolucion 
public class Resolucion1K extends Resolucion {

  //
  // Fields
  // 
  // Campos de tipo protect que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
   //Largo=768 x ancho= 1024
	protected final static double LARGO = 768;
	protected final static double ANCHO = 1024;
	

  //
  // Constructors
  //
 //Herrera improvement public Resolucion1K () { };
 //Super toma como parametros el largo y el ancho 
//Creamos el constructor Resolucion1k 
	public Resolucion1K(){
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
   

}//Cierre de la clase y del metodo
