import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ABondarev on 05.09.2017.
 */
public class HTMLGenerator {
    Country[] countries;
    HTMLGenerator(Country[] countriess) {
        this.countries = countriess;
    }

    void generateHTMLList() {
        File file = new File("countries.html");
        try {
            FileWriter fw = new FileWriter(file);
            fw.append("<html> <title>Countries</title> <head> </head> <body> <table border=\"1\"> <tr> <th>Страна</th> <th>Численность населения</th> <th>Процент от мирового населения</th> </tr>");
            for (int i = 0; i < countries.length; i++) {
                fw.write("<tr><td>" + countries[i].countryName + "</td><td>" + countries[i].peopleCount + "</td><td>" + countries[i].percent + "</td></tr>");
                fw.append("\n");
            }
            fw.append("</table></body></html>");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
