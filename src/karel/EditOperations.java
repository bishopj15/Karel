/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karel;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 *
 * @author Allen
 */
public class EditOperations {
    
    final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    Transferable clipData;
    String data = new String();
    
    public EditOperations(){
        
    }
    
    public void copy(String selection){
        
        StringSelection data = new StringSelection(selection);
        clipboard.setContents(data, data);
    }
    
    public String paste(){
        clipData = clipboard.getContents(clipboard);
            if (clipData != null) {
              try {
                if (clipData.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                  data = (String)(clipData.getTransferData(
                    DataFlavor.stringFlavor));
                }
              } catch (UnsupportedFlavorException ufe) {
                System.err.println("Flavor unsupported: " + ufe);
                return null;
              } catch (IOException ioe) {
                System.err.println("Data not available: " + ioe);
              }
            }
            
            return data; 
    }
}
