package Object;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;



public class Serveur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub//1240
		ServerSocket ss=new ServerSocket(1241);
		System.out.println("je suis le serveur j'attends la connexion");
		while (true){
			Socket sc=ss.accept();

			//lire des octets
			InputStream I=sc.getInputStream();//lire les donnees qui vont venir a la socket que j'ai cree

			//tp serialisation
			ObjectInputStream OB=new ObjectInputStream(I);
			Voiture v=(Voiture)OB.readObject();
			new ClientThread(v,sc).start();
		}

	}

}
