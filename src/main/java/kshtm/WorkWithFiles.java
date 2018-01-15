package kshtm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {

    public static void main(String[] args){


        try(FileWriter writeFile = new FileWriter("StudyFile.txt")){
            writeFile.write("I \nstudy \nstreams");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader readBuffer = new BufferedReader(new FileReader("StudyFile.txt"))){
            String s = readBuffer.readLine();
            while (s != null){
                System.out.println(s);
                s = readBuffer.readLine();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
