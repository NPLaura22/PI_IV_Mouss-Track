package server;

import com.sun.net.httpserver.HttpServer;

import server.handler.RootHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MainServer {
    public static void main(String[] args) {
        try {
            int port = 8080;
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            
            // Rota principal para teste
            server.createContext("/ping", new RootHandler());
            
            server.setExecutor(null); // Usa o executor padrão
            server.start();
            
            System.out.println("Servidor rodando em http://localhost:" + port);
        } catch (IOException e) {
            System.out.println("Erro ao iniciar servidor: " + e.getMessage());
        }
    }
}
