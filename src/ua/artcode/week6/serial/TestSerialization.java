package ua.artcode.week6.serial;

import ua.artcode.utils.io.IOHelper;
import ua.artcode.utils.io.RobocopSerializator;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 25.10.15.
 */
public class TestSerialization {

    public static void main(String[] args) throws FileNotFoundException {
        Robocop robocop = new Robocop("Chappie", 70, 100, 30000);
        IOHelper.saveObj("robo.txt", robocop);

        Object read = IOHelper.loadObj("robo.txt");
        Robocop loadedRobo = (Robocop) read;

        System.out.println(loadedRobo);


        IOHelper.saveRobocop("robo_user.txt", robocop);


        RobocopSerializator serilaizator = new RobocopSerializator();
        IOHelper.formatSave("format_robot.txt", robocop, serilaizator);
        Robocop robocop1 = IOHelper.formatLoad("format_robot.txt", serilaizator);

        System.out.println(robocop1);
    }
}
