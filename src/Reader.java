import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
    int n;

   ArrayList<String> astrings = new ArrayList<>();
   public String[] sstring;
   public Country countries;
   ArrayList<String[]> ccoun = new ArrayList<>();
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
        } catch (IOException e){
            System.out.println("Ошибка");

        }
    }

    void sort() {
        Arrays.sort(sstring);
        for (int i = 0; i < sstring.length; i++) {
            System.out.println(sstring[i]);
        }
    }

    void write() {
        File file = new File("countries.txt");
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < sstring.length; i++) {
                fw.write(sstring[i]);
                fw.append("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  /* void parse(){
       for (int i = 0; i < sstring.length ; i++) {
           ccoun.set(i, sstring[])

       }


    }*/

}


