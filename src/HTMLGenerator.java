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
            fw.append("<html> <title>Countries</title> <head<meta charset=\"utf-8\"> </head> <body> <table border=\"1\"> <tr> <th>Страна</th> <th>Численность населения</th> <th>Процент от мирового населения</th> </tr>");
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

    void generateHTMLAlphList() {
        File file = new File("countriesIndex.html");
        try {
            FileWriter fw = new FileWriter(file);
            fw.append("<html> <title>Countries</title> <head> </head> <body>");
            fw.write("<a href=\"#" + countries[0].countryName.charAt(3) + "\">" + countries[0].countryName.charAt(3) + "</a>\n");     //заголовок
            for (int i = 1; i < countries.length; i++) {
                char temp = countries[i].countryName.charAt(3);
                if (temp != countries[i - 1].countryName.charAt(3)) {
                    fw.write("<a href=\"#" + temp + "\">" + temp + "</a> ");
                }
            }

            fw.append("<br>");

            for (int i = 0; i < countries.length; i++) {
                char temp = countries[i].countryName.charAt(3);
                if (i == 0 && temp == countries[i + 1].countryName.charAt(3)) {
                    fw.write("<a name=\"" + temp + "\">" + temp + "</a><br>");
                }
                else if (temp != countries[i - 1].countryName.charAt(3)) {
                    temp = countries[i + 1].countryName.charAt(3);
                    fw.write("<a name=\"" + temp + "\">" + temp + "</a><br>");
                }
                else
                    fw.write(countries[i].countryName + " <br>");
            }
            fw.append("</body></html>");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
