package utils;

import ec.edu.espe.map.model.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    
    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".csv");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator"));
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }

    public static String read(String fileName) {
        String text = " ";
        try {
            Scanner s= new Scanner(new File(fileName));
            while(s.hasNextLine()){
                text = text + s.nextLine() + "\n";
                
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        return text;
    }
}
   
    
    

