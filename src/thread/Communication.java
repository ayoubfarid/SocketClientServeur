package thread;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Communication extends  Thread{
    protected  Socket sc;
    protected  int numClient;
    public Communication(Socket sc,int numClient) {
        this.sc=sc;
        this.numClient=numClient;
    }

    @Override
    public void run() {
        try {
            InputStream is=sc.getInputStream();
            InputStreamReader ir=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(ir);
            OutputStream os=sc.getOutputStream();
            PrintWriter pr=new PrintWriter(os,true);
            pr.println("client connected");
            pr.println(numClient);
            while (true){

                String req=br.readLine();
                System.out.println(req);
                int res=req.length();
                //pr.println(res);
                String rep=new Scanner(System.in).nextLine();
                pr.println("Server :" +rep);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
