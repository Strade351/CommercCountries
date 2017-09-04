import java.io.*;
import java.util.ArrayList;

public class Reader {
    int n;
   ArrayList<String> astrings = new ArrayList<>();
   String[] sstring;
    public void reader(){
        try{
            FileInputStream fstream = new FileInputStream("countries.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                astrings.add(strLine);

            }

            astrings.remove(0);
            sstring = new String[astrings.size()] ;
            for (int i = 0; i < sstring.length ; i++) {
                sstring[i] = astrings.get(i);

            }
        }catch (IOException e){
            System.out.println("Ошибка");

        }

    }

}
