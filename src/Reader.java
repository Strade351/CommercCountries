import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {

   ArrayList<String> astrings = new ArrayList<>();
   public String[] sstring;

   public ArrayList<Country> countries = new ArrayList<>();

   public Country [] ccountries;


   public void fillStrList(){
        try{
            FileInputStream fstream = new FileInputStream("countries.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                astrings.add(strLine);
            }
        } catch (IOException e){
            System.out.println("Ошибка");
        }
   }

  void fillContries(Countries c){
       for (int i = 0; i < sstring.length ; i++) {
           String[] tmp = sstring[i].split(" - ");
           String counts =  tmp[1].replace(",", "");
           c.addCountry(tmp[0], Integer.parseInt(counts));
       }
   }


}


