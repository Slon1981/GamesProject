import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        File file1 = new File("D:/Games/src");
        if (file1.mkdir()) {
            builder.append("Папка " + file1 + " успешно создана\n");
        } else {
            builder.append("Папка " + file1 + " не создана\n");
        }

        File file1_1 = new File("D:/Games/src/main");
        if (file1_1.mkdir()) {
            builder.append("Папка " + file1_1 + " успешно создана\n");
        } else {
            builder.append("Папка " + file1_1 + " не создана\n");
        }

        File file1_2 = new File("D:/Games/src/test");
        if (file1_2.mkdir()) {
            builder.append("Папка " + file1_2 + " успешно создана\n");
        } else {
            builder.append("Папка " + file1_2 + " не создана\n");
        }

        File file2 = new File("D:/Games/res");
        if (file2.mkdir()) {
            builder.append("Папка " + file2 + " успешно создана\n");
        } else {
            builder.append("Папка " + file2 + " не создана\n");
        }

        File file2_1 = new File("D:/Games/res/drawables");
        if (file2_1.mkdir()) {
            builder.append("Папка " + file2_1 + " успешно создана\n");
        } else {
            builder.append("Папка " + file2_1 + " не создана\n");
        }

        File file2_2 = new File("D:/Games/res/vectors");
        if (file2_2.mkdir()) {
            builder.append("Папка " + file2_2 + " успешно создана\n");
        } else {
            builder.append("Папка " + file2_2 + " не создана\n");
        }

        File file2_3 = new File("D:/Games/res/icons");
        if (file2_3.mkdir()) {
            builder.append("Папка " + file2_3 + " успешно создана\n");
        } else {
            builder.append("Папка " + file2_3 + " не создана\n");
        }

        File file3 = new File("D:/Games/savegames");
        if (file3.mkdir()) {
            builder.append("Папка " + file3 + " успешно создана\n");
        } else {
            builder.append("Папка " + file3 + " не создана\n");
        }

        File file4 = new File("D:/Games/temp");
        if (file4.mkdir()) {
            builder.append("Папка " + file4 + " успешно создана\n");
        } else {
            builder.append("Папка " + file4 + " не создана\n");
        }


        try {
            File file1_1_1 = new File("D:/Games/src/main/Main.java");
            if (file1_1_1.createNewFile()) {
                builder.append("Файл " + file1_1_1 + " успешно создан\n");
            } else {
                builder.append("Файл " + file1_1_1 + " не создан\n");
            }

            File file1_1_2 = new File("D:/Games/src/main/Utils.java");
            if (file1_1_2.createNewFile()) {
                builder.append("Файл " + file1_1_2 + " успешно создан\n");
            } else {
                builder.append("Файл " + file1_1_2 + " не создан\n");
            }

            File file4_1 = new File("D:/Games/temp/temp.txt");
            if (file4_1.createNewFile()) {
                builder.append("Файл " + file4_1 + " успешно создан\n");
            } else {
                builder.append("Файл " + file4_1 + " не создан\n");
            }

            FileWriter writer = new FileWriter(file4_1);
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}