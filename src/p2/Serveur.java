package p2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;



public class Serveur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub//1240
		ServerSocket ss=new ServerSocket(1240);
		System.out.println("je suis le serveur j'attends la connexion");
		Socket sc=ss.accept();
		
		//lire des octets
		InputStream I=sc.getInputStream();//lire les donnees qui vont venir a la socket que j'ai cree
	    
	    //tp serialisation
	    ObjectInputStream OB=new ObjectInputStream(I);
	    Voiture v=(Voiture)OB.readObject();
	    
	    System.out.println("Voiture recu de client est : "+v);
	    
	    
	    System.out.println("j'envoie a mon tour  la voiture modifiee");
	    OutputStream O=sc.getOutputStream();
	     v.setNom("Voiture_modifie");
		//System.out.println(v);
		ObjectOutputStream OBB=new ObjectOutputStream(O);
		OBB.writeObject(v);
		OB.close();
		OBB.close();
	}

}
