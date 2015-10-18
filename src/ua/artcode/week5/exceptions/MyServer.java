package ua.artcode.week5.exceptions;

/**
 * Created by serhii on 18.10.15.
 */
public class MyServer {

    private boolean started;

    public String connect(String login, String pass) throws ConnectServerException{
        if(!login.equals("admin") || !started){
            throw new ConnectServerException();
        }

        return "successful";
    }

    public static class ConnectServerException extends Exception{

    }


}
