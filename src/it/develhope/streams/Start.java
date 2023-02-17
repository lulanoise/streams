package it.develhope.streams;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        File file = new File("src/file.txt");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {
            if (file.exists()) {
                System.out.println("File already exists, overwriting...");
            } else {
                System.out.println("Creating new file...");
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(dtf.format(now));
            fileWriter.close();
            System.out.println("File wrote.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
