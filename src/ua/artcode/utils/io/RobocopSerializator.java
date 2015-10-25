package ua.artcode.utils.io;

import ua.artcode.week6.serial.Robocop;

import java.io.File;
import java.util.Scanner;

/**
 * Created by serhii on 25.10.15.
 */
public class RobocopSerializator implements MySerializator<Robocop> {
    @Override
    public String format(Robocop robocop) {
        String roboStr = "";
        roboStr += String.format("%s=%s\n", "model", robocop.getModel());
        roboStr += String.format("%s=%s\n", "health", robocop.getHealth());
        roboStr += String.format("%s=%s\n", "power", robocop.getPower());
        roboStr += String.format("%s=%s\n", "price", robocop.getPrice());
        return roboStr;
    }

    @Override
    public Robocop parse(String strObject) {
        Scanner sc = new Scanner(strObject);
        Robocop robocop = new Robocop();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] parts = line.split("=");
            String fieldName = parts[0];
            String fieldValue = parts[1];
            if("model".equals(fieldName)){
                robocop.setModel(fieldValue);
            } else if("health".equals(fieldName)){
                robocop.setHealth(Integer.parseInt(fieldValue));
            } else if("power".equals(fieldName)) {
                robocop.setPower(Integer.parseInt(fieldValue));
            } else if("price".equals(fieldName)){
                robocop.setPrice(Double.parseDouble(fieldValue));
            }
        }


        return robocop;
    }
}
