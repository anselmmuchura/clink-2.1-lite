
package clink;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alvo
 */
public class Config {
    public static String readFile(String filePath){
    File fl=new File(filePath);
    Scanner scan=null;
    try {
            scan=new Scanner(fl);
        } catch (FileNotFoundException ex) {
            //config file is not there
        }
        
    String fileString=scan.nextLine();
            
        return fileString;
    }
    
    public void writeFile(String filePath,String newConfig){
        try { 
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(newConfig);
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public static void errorFileWriter(String message) throws IOException{
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        File f=new File("errors.html");
        FileWriter fw=new FileWriter(f,true);
        fw.write("<ul><li>time: "+timestamp+"</li><br>");
        fw.write("<li>"+message+"</li></ul></br>");
        fw.close();
    }
}
