package Cliente;

import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JTextField;

public class EnviarTexto implements ActionListener {
    final String IP_ADD = "192.168.100.10";
    final int PORT = 1555;

    private JTextField[] ctx;

    @Override
    public void actionPerformed(final ActionEvent e) {
        ctx = GUI.getCtx();

        try {
            Socket sckt = new Socket(IP_ADD, PORT);
            DataOutputStream flujo_salida = new DataOutputStream(sckt.getOutputStream());
            flujo_salida.writeUTF(ctx[0].getText());
            flujo_salida.close();

            System.out.println("Enviado");
        } catch (UnknownHostException e1) {
            System.out.println("Error: " +  e1.getMessage());
        } catch (IOException e1) {
            System.out.println("Error: " +  e1.getMessage());
        }

    }
    
}