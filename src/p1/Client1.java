package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1  {

public static void main(String[] args) throws UnknownHostException, IOException {
	Socket s= new Socket("localhost",1240); // adr ip du serveur et le port de connexion
	System.out.println("je suis le client je vien de me connecter");
	
	OutputStream os=s.getOutputStream();
	PrintWriter pr =new PrintWriter(os,true);
	pr.println("hello world");
	
	InputStream is=s.getInputStream();
	InputStreamReader isr= new InputStreamReader(is);
	BufferedReader  br = new BufferedReader(isr);
	String chaine=br.readLine();
	System.out.println("Client : le serveur m'a envoyee cette reponse: "+ chaine);
	
	
	
}	
}
