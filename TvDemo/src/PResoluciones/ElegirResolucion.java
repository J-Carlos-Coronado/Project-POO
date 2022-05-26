package PResoluciones;
// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alejandro Espinoza  (Coder)
//@version: 24/05/2022
//Las librerías Java nos permiten reutilizar código, es decir,podemos hacer uso de las clases, métodos y atributos que componen la
//librería evitando así tener que implementar nosotros mismos esas funcionalidades
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;

// con esta clase podemos elegir la resolucion  eimplemnetamos una la accion de lista 
public class ElegirResolucion extends javax.swing.JFrame implements ActionListener {
    // Generamos la lista para elegir a traves de un arreglo 
    ArrayList<String> resoluciones;
    private final JButton[] botones;
    private final JButton btnSalir;
    public String resolucionActual; 
    // En este apartado podremos elegir la resolucion 
    //El arreglo va iterando 1 a uno depende de la resolucion que elegimos y se detoiene cuando presionemos una resolucion
    public ElegirResolucion() {
        initComponents();
        this.resoluciones = PResoluciones.ResolucionDatos.leerArchivo();
        botones = new JButton[resoluciones.size()];
        int i;
        for (i = 0; i < resoluciones.size(); i++) {
            botones[i] = new JButton(resoluciones.get(i));
            botones[i].setBounds(i*120+10,100,120,30);//para acomodar (requiere correcion)
            add(botones[i]);
            botones[i].addActionListener(this);
        }
        // en este apartado presionamos la opcion salir y cierra la ventana 
        btnSalir = new JButton("salir");
        btnSalir.setBounds(i*120+10,100,120,30);
        addWindowListener(new CierraVentana());
        setSize(800, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String valor = e.getActionCommand();
        resolucionNueva(valor);
        resolucionActual = valor;
    }

    public String resolucionNueva(String reso) {
        System.out.println(reso);
        return reso;
    }

    /**
    * Este método se llama desde dentro del constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElegirResolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirResolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirResolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirResolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirResolucion().setVisible(true);
            }
        });
    }

    class CierraVentana extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}//Campos de la clase

 //Cierre del método
