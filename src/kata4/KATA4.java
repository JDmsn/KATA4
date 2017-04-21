package kata4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException

public class KATA4 {
  
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String nameFile = "C:\\Users\\moises\\Desktop\\emailsfilev1.txt";
        ArrayList<String> read = MailListReader.read(nameFile);
        /*for(String elem : read) {
            System.out.println(elem);
        }*/    
        Histogram <String> hm = MailHistogramBuilder.build(read);
        
        new HistogramDisplay(hm).execute();
       
    }

}
