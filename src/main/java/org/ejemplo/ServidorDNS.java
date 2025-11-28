package org.ejemplo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorDNS {
    public static void main(String[] args) {

        try {
            ServerSocket serversocket = new ServerSocket( 1234);
            System.out.println("Servidor Iniciado - Esperando conexión");
            Socket socket = serversocket.accept();
            System.out.println("Cliente conectado exitosamente");
            //Streams para leer y escibir vía socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (reader.readLine() != null) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
