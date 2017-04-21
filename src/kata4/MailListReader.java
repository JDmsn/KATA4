package kata4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;


public class MailListReader {
    
    public static ArrayList<String> read(String name) throws FileNotFoundException, IOException {
        ArrayList<String> mlList = new ArrayList<>();       
        BufferedReader fileRead = new BufferedReader(new FileReader(new File(name)));
        String ml;
        
        while((ml=fileRead.readLine())!= null) {
            if(!ml.contains("@")) continue;
            mailList.add(mail);
        }  
        return mlList;
    }
    
}
