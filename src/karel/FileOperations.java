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
    
    /**
     * Sets the name of the file being opened or saved
     * @param name Name of file
     */
    public void setFileName(String name){
        fileName = name;
    }
    
    /**
     * Text to be saved to the file
     * @param data 
     */
    public void setFileData(String data){
        fileData = data;
    }
    
    /**
     * Gets the name of the file
     * @return Name of the file 
     */
    public String getFileName(){
        return fileName;
    }
    
    /**
     * Gets the data from the file
     * @return String of characters from the file 
     */
    public String getFileData(){
        return fileData;
    }
    
    /**
     * Writes FileData to FileName location as a text file 
     */
    public void save(){
        
        if(!fileName.endsWith(".txt")){
            fileName = fileName.concat(".txt");
        }
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(fileData);
            bw.close();
            } catch(IOException e){
                e.printStackTrace();
            }
       } 

    /**
     * Reads data from the file located at the FileName location 
     * @return Data from the file
     */
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
