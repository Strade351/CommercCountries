import java.io.*;
import java.util.ArrayList;

public class Reader {
    int n;
   ArrayList<String> strings = new ArrayList<>();
    public void reader(){
        try{
            FileInputStream fstream = new FileInputStream("countries.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                strings.add(strLine);

            }
            strings.remove(0);
        }catch (IOException e){
            System.out.println("Ошибка");
        }

    }

}
