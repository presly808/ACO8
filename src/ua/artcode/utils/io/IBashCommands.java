package ua.artcode.utils.io;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 24.10.15.
 */
public interface IBashCommands {


    String ls(String dirPath);
    String less(String filePath) throws FileNotFoundException;
    String find(String dirPath, String keyword);
    String touch(String filePath);
    // see '>'
    String writeInto(String filePath, String source);
    // '>>'
    String appendInto(String filePath, String source);
    // like a filter
    String grep(String source, String target);
    // grep -R target
    String grepR(String source, String target);



}
