package ua.artcode.week5.exceptions;

/**
 * Created by serhii on 18.10.15.
 */
public class TestMyServer {

    public static void main(String[] args) {
        MyServer myServer = new MyServer();
        try{
            String connection = myServer.connect("sdf","234");
            System.out.println("work with connection");
        } catch (MyServer.ConnectServerException c){
            c.printStackTrace();
            System.out.println("reconnect to server");
        }
        System.out.println("end of code");
    }
}
