package Servidor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame{
    // Componentes
    RecibirTexto server = new RecibirTexto();
    Thread hilo = new Thread(server);
    private final JPanel panel = new JPanel();
    private final JLabel[] etq = new JLabel[1];
    private static JTextArea txa = new JTextArea();


    public GUI() {
        this.setTitle("Servidor");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        componentes();
    }

    public static void agregarTexto(String texto){
        txa.append(texto);
    }


    private void componentes(){
        inicializarPanel();
        etiquetas();
        areaTexto();
        modoServidor();
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
        
        etq[0].setText("Mensaje Recibido:");
        etq[0].setBounds(50, 20, 300, 20);
    }

    private void areaTexto(){
        txa.setEditable(false);
        txa.setBounds(50, 50, 300, 300);
        panel.add(txa);
    }

    private void modoServidor(){
        hilo.start();
    }
    
    private static final long serialVersionUID = -5369034354604818133L;
}