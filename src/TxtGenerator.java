import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Anatoliy on 06.09.2017.
 */
public class TxtGenerator {

    Countries countries;

    TxtGenerator(Countries countries) {
        this.countries = countries;
    }

    void generatetxt() {
    File file = new File("countriessort.txt");
    try {
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < countries.countries.size(); i++) {
            fw.write(countries.countries.get(i).getCountryName() + " " + countries.countries.get(i).getPeopleCount() + " " + countries.countries.get(i).getPercent());
            fw.append("\r\n");
        }
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
