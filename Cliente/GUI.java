package Cliente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
    // Componentes
    private final JPanel panel = new JPanel();
    private final JLabel[] etq = new JLabel[1];
    private final static JTextField[] ctx = new JTextField[1];
    private final JButton[] btn = new JButton[1];

    public GUI() {
        this.setTitle("Cliente");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        componentes();
    }

    public static JTextField[] getCtx() {
        return ctx;
    }

    private void componentes(){
        inicializarPanel();
        etiquetas();
        cajaDeTexto();
        botones();
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
    
    private void cajaDeTexto(){
        for (int i = 0; i < ctx.length; i++) {
            ctx[i] = new JTextField();
            panel.add(ctx[i]);
        }

        ctx[0].setBounds(50, 50, 200, 30);
    }

    private void botones(){
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            panel.add(btn[i]);
        }

        btn[0].setText("Enviar");
        btn[0].setBounds(260, 50, 100, 30);

        final EnviarTexto enviar = new EnviarTexto();
        btn[0].addActionListener(enviar);
    }







    private static final long serialVersionUID = 8146428215263583748L;
}