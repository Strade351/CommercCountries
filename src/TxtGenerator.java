import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Anatoliy on 06.09.2017.
 */
public class TxtGenerator {

    ArrayList<Country> countries;

    TxtGenerator(ArrayList<Country> countries) {
        this.countries = countries;
    }

    void generatetxt() {
    File file = new File("countriessort.txt");
    try {
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < countries.size(); i++) {
            fw.write(countries.get(i).getCountryName() + " " + countries.get(i).getPeopleCount() + " " + countries.get(i).getPercent());
            fw.append("\r\n");
        }
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
