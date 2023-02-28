package p3;

import java.io.*;
import java.net.Socket;



public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",1240);//la methode est surchargee (on peut avoir le client dans une autre machine)
		OutputStream O=s.getOutputStream();
		System.out.println("je suis le client j'envoie un mssg au serveur");
		//l'objet a serialiser
		Voiture v=new Voiture(1,"VOITURE1");
		//System.out.println(v);
		ObjectOutputStream OB=new ObjectOutputStream(O);
		OB.writeObject(v);
		
		
		System.out.println("je lis un objet modifie de serveur");
		//lire des octets
	    InputStream I=s.getInputStream();//lire les donnees qui vont venir a la socket que j'ai cree
		ObjectInputStream IO=new ObjectInputStream(I);
	    Voiture vE=(Voiture)IO.readObject();
	  System.out.println("Voiture recu de serveur est : "+vE);
		
	    OB.close();
	   IO.close();
	}

}
