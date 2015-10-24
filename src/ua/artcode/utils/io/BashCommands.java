package ua.artcode.utils.io;

import java.io.File;
import java.io.FileNotFoundException;
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
    public String less(String filePath) {
        try {
            Scanner sc = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
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
    public String writeInto(String filePath, String source) {
        try {
            PrintWriter pw = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
