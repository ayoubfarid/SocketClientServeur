package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(1240);
		
		System.out.println("je suis le serveur j'attend une connexion");
		Socket so=ss.accept();
		
		InputStream is=so.getInputStream();
		InputStreamReader isr= new InputStreamReader(is);
		BufferedReader  br = new BufferedReader(isr);
		String chaine=br.readLine();
		System.out.println("la chaine envoye est : "+ chaine);
		
		
		OutputStream os=so.getOutputStream();
		PrintWriter pr =new PrintWriter(os,true);
		pr.println("bien recu");
		
	}
}
