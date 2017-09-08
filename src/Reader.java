import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {

    ArrayList<String> astrings = new ArrayList<>();
    ArrayList<String> cstrings = new ArrayList<>();


    public void fillStrListCountries() {
        try {
            FileInputStream fstream = new FileInputStream("countries.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int count = 0;
            while ((strLine = br.readLine()) != null) {
                astrings.add(strLine);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }

    void fillContries(Countries c) {
        fillStrListCountries();
        for (int i = 1; i < astrings.size(); i++) {
            String[] tmp = astrings.get(i).split(" - ");
            String counts = tmp[1].replace(",", "");
            c.addCountry(tmp[0], Integer.parseInt(counts));
        }
    }
    public void fillStrListContinents() {
        try {
            FileInputStream fstream = new FileInputStream("continents.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int count = 0;
            while ((strLine = br.readLine()) != null) {
                cstrings.add(strLine);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
    public void fillContinents(){

    }
}


