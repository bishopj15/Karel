package karel;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Allen
 */
public class FileOperations {
    
    public FileOperations(String textAreaData, String curFile){
        fileData = textAreaData;
        fileName = curFile;
    }
    
    public void setFileName(String name){
        fileName = name;
    }
    
    public void setFileData(String data){
        fileData = data;
    }
    
    public String getFileName(String name){
        return fileName;
    }
    
    public String getFileData(String data){
        return fileData;
    }
    
    public void save(){

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
            bw.write(fileData);
            bw.close();
            } catch(IOException e){
                e.printStackTrace();
            }
       } 

    
    public String open(){
         String tempString = new String();
         String info = new String();
        
         try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((tempString = br.readLine()) != null) {
                info += (tempString + "\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
            
        return info;
    }
    
    private String fileData;
    private String fileName;
    
}
