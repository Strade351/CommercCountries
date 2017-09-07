import java.util.ArrayList;

/**
 * Created by ABondarev on 04.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.reader();

        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(0, new Country("Borovia", 250205));
        countries.add(0, new Country("Aorovia", 250205));
        countries.add(0, new Country("Xorwefwef", 250205));

        Countries countries1 = new Countries(countries);
        countries1.sortCountries();
        TxtGenerator txtGenerator = new TxtGenerator(countries);
        txtGenerator.generatetxt();
    }

}
