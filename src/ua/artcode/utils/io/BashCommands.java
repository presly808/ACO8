package ua.artcode.utils.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by serhii on 24.10.15.
 */
public class BashCommands implements IBashCommands {


    @Override
    public String ls(String dirPath) {
        return null;
    }

    @Override
    public String less(String filePath) throws FileNotFoundException {
        if(!new File(filePath).exists())
            throw new FileNotFoundException("file with name " + filePath + " dosen't exists");


        StringBuilder sb = new StringBuilder();
        try {
            Scanner sc = new Scanner(new File(filePath));
            while(sc.hasNextLine()){
                sb.append(sc.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override
    public String find(String dirPath, String keyword) {
        return null;
    }

    @Override
    public String touch(String filePath) {
        return null;
    }

    @Override
    public String writeInto(String filePath, String source)  {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(filePath, false));
            pw.println(source);
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(pw != null){
                pw.close(); // call flush
            }
        }
        return null;
    }

    @Override
    public String appendInto(String filePath, String source) {
        try {
            PrintWriter pw = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String grep(String source, String target) {
        return null;
    }

    @Override
    public String grepR(String source, String target) {
        return null;
    }
}
