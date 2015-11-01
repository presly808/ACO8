package ua.artcode.week6.test_io;

import ua.artcode.utils.io.BashCommands;
import ua.artcode.utils.io.IBashCommands;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 25.10.15.
 */
public class _02Test {

    public static void main(String[] args) {
        IBashCommands bc = new BashCommands();
            bc.writeInto("file2.txt", "print writer info");

    }
}
