package Object;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientThread extends Thread {
    private Voiture v;
    private Socket sc;
    private static int compteur;

    public ClientThread(Voiture v, Socket sc) {
        this.v = v;
        this.sc=sc;
    }
    public void run(){
        System.out.println(v);
        synchronized (this){
            compteur++;
            System.out.println(compteur);
            try {
                ObjectOutputStream os=new ObjectOutputStream(sc.getOutputStream());
                v.setId(compteur);
                os.writeObject(v);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
