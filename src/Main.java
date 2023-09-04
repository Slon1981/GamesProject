import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {

        createDir("D:/Games/src");
        createDir("D:/Games/src/main");
        createDir("D:/Games/src/test");
        createDir("D:/Games/res");
        createDir("D:/Games/res/drawables");
        createDir("D:/Games/res/vectors");
        createDir("D:/Games/res/icons");
        createDir("D:/Games/savegames");
        createDir("D:/Games/temp");

        createFile("D:/Games/src/main/Main.java");
        createFile("D:/Games/src/main/Utils.java");
        File logFile = createFile("D:/Games/temp/temp.txt");


        try {
            FileWriter writer = new FileWriter(logFile);
            writer.write(log.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDir(String dirPath) {
        File dir1 = new File(dirPath);
        if (dir1.mkdir()) {
            log.append("Папка " + dirPath + " успешно создана\n");
        } else {
            log.append("Папка " + dirPath + " не создана\n");
        }
    }

    public static File createFile(String filePath) {
        File file1 = new File(filePath);
        try {
            if (file1.createNewFile()) {
                log.append("Файл " + filePath + " успешно создан\n");
            } else {
                log.append("Файл " + filePath + " не создан\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return file1;
    }
}