package eJavaClassesUtilitárias.Aula32InputOutput.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            // boolean isDeleted = file.delete();

            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);

            System.out.println("Path " + file.getPath());
            System.out.println("Path Absolute" + file.getAbsolutePath());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is File " + file.isFile());
            System.out.println("Is Hidden " + file.isHidden());
            System.out.println("Last modified " + file.lastModified());
            System.out.println("Last modified " + new Date(file.lastModified()));
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
