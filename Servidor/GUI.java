package Servidor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame{
    // Componentes
    private final JPanel panel = new JPanel();
    private final JLabel[] etq = new JLabel[1];


    public GUI() {
        this.setTitle("Aplicación Servidor");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        componentes();
    }


    private void componentes(){
        inicializarPanel();
        etiquetas();
    }

    private void inicializarPanel(){
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void etiquetas(){
        for (int i = 0; i < etq.length; i++) {
            etq[i] = new JLabel();
            panel.add(etq[i]);
        }
        
        etq[0].setText("Ingrese el Mensaje:");
        etq[0].setBounds(50, 20, 300, 20);
    }
    
    private static final long serialVersionUID = -5369034354604818133L;
}