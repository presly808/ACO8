package ua.artcode.week6.file;

import java.io.File;
import java.io.IOException;

public class TestFile {


    public static final String ABSOLUTE_PATH = "/home/serhii/dev/IdeaProjects/ACO8/src/ua/artcode/recursion/tree/company/ComapnyManagerSystem.java";
    public static final String RELATIVE_PATH = "src/ua/artcode/recursion/tree/company/ComapnyManagerSystem.java";

    public static void main(String[] args) {
        // path -
        File file1 = new File(ABSOLUTE_PATH);
        File file2 = new File(RELATIVE_PATH);

        File directory = new File("/home/serhii/dev/IdeaProjects/ACO8/");

        System.out.printf("name %s, result %s\n",
                "file1.isDirectory()", file1.isDirectory());

        System.out.printf("name %s, result %s\n",
                "file1.isFile()", file1.isFile());

        System.out.printf("name %s, result %s\n",
                "file1.isName()", file1.getName());

        file1.exists();

        System.out.println(file1.getAbsolutePath());
        file1.getParent();
        file1.getParentFile();

        file1.canExecute();
        file1.canRead();
        file1.canWrite();

        file1.setExecutable(false);
        file1.setReadable(true);
        file2.setWritable(true);

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File testDir = new File("test_dir");
        testDir.mkdir();

        new File("dir_for_del").delete();

        //
        File[] children = directory.listFiles();
        for (File child : children) {

        }


    }
}
