package thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    private int numClient;
    public void run(){
        try {
            ServerSocket sc=new ServerSocket(1244);
            System.out.println(" je suis le serveur j'attend une requette ");
            while (true){

                Socket sa= sc.accept();
                numClient++;
                new Communication(sa,numClient).start();


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        new Server().start();
    }
}
