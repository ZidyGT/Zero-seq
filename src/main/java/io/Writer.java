package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    private static FileWriter writer;
    private static PrintWriter printer;

    public Writer(String path) {
        try {
            writer = new FileWriter(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printer = new PrintWriter(writer);
    }


    public void writeLine(String line){
        printer.println(line);
    }

    public void close(){
        printer.close();
    }
}
