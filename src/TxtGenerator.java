import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Anatoliy on 06.09.2017.
 */
public class TxtGenerator {

    Country[] countries;

    TxtGenerator(Country[] countries) {
        this.countries = countries;
    }

    void generatetxt() {
    File file = new File("countriessort.txt");
    try {
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < countries.length; i++) {
            fw.write(countries[i].countryName + " " + countries[i].peopleCount + " " + countries[i].percent);
            fw.append("\r\n");
        }
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}