package Servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RecibirTexto implements Runnable {
    final int PORT = 1555;

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(PORT);
            while (true) {
                Socket sckt = server.accept();
                DataInputStream flujo_entrada = new DataInputStream(sckt.getInputStream());
                GUI.agregarTexto(flujo_entrada.readUTF() + '\n');
                sckt.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}