import sun.font.FontRunIterator;

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

    public void fillContinents(Countries c) {
        fillStrListContinents();
        String cont = null;
        Continents tmpcont = null;
        for (int i = 0; i < cstrings.size(); i++) {
            if (i == 0 || (i != 0 && (cstrings.get(i - 1).equals("")))) {
                String[] tmp;
                tmp = cstrings.get(i).split(" ");
                System.out.println(tmp[0]);
                cont = tmp[0];
                System.out.println(cont);
            } else {
                cont = cstrings.get(i);
            }
            switch (cont) {
                case "AFRICA":
                    tmpcont = Continents.AFRICA;
                    System.out.println("12");
                    break;
                case "ASIA":
                    tmpcont = Continents.ASIA;
                    break;

                case "EUROPE":
                    tmpcont = Continents.EUROPE;
                    break;
                case "N.":
                    tmpcont = Continents.NAMERICA;
                    break;
                case "S.":
                    tmpcont = Continents.SAMERICA;
                    break;
                case "OCEANIA":
                    tmpcont = Continents.OCEANIA;
                    break;

            }

            for (int j = 0; j < c.countries.size(); j++) {
                if (c.countries.get(i).getCountryName().equals("  "+cont)) {
                    System.out.println("пиу");
                    c.countries.get(i).setContinent(tmpcont);
                }

            }
            int x=8;


        }

    }
}


