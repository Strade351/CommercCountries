import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ABondarev on 05.09.2017.
 */
public class HTMLGenerator {
    Countries countries;
    HTMLGenerator(Countries countries) {
        this.countries = countries;
    }

    void generateHTMLList() {
        File file = new File("countries.html");
        try {
            FileWriter fw = new FileWriter(file);
            fw.append("<html> <title>Countries</title> <head<meta charset=\"utf-8\"><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"> </head> <body> <table border=\"1\"> <tr> <th>Страна</th> <th>Численность населения</th> <th>Процент от мирового населения</th> </tr>");
            for (int i = 0; i < countries.countries.size(); i++) {
                fw.write("<tr><td>" + countries.countries.get(i).getCountryName() + "</td><td>" + countries.countries.get(i).getPeopleCount() + "</td><td>" + countries.countries.get(i).getPercent() + "</td></tr>");
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
            fw.append("<html> <title>Countries</title> <head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"> </head> <body>");
            fw.write("<a href=\"#" + countries.countries.get(0).getCountryName().charAt(3) + "\">" + countries.countries.get(0).getCountryName().charAt(3) + "</a>\n");     //заголовок
            for (int i = 1; i < countries.countries.size(); i++) {
                char temp = countries.countries.get(i).getCountryName().charAt(3);
                if (temp != countries.countries.get(i - 1).getCountryName().charAt(3)) {
                    fw.write("<a name=\"Top\" href=\"#" + temp + "\">" + temp + "</a> ");
                }
            }

            fw.append("<br>");

            for (int i = 0; i < countries.countries.size(); i++) {
                char temp = countries.countries.get(i).getCountryName().charAt(3);
                if (i == 0 && temp == countries.countries.get(i + 1).getCountryName().charAt(3)) {
                    fw.write("<a name=\"" + temp + "\">" + temp + "</a><br>" + countries.countries.get(i).getCountryName() + "<br>" );
                }
                else if (temp != countries.countries.get(i - 1).getCountryName().charAt(3)) {
                    //temp = countries[i + 1].countryName.charAt(3);
                    fw.write("<p> <a href=\"#Top\">Top</a> </p>");
                    fw.write("<a name=\"" + temp + "\">" + temp + "</a><br>");
                    fw.write(countries.countries.get(i).getCountryName() + " <br>");
                }
                else
                    fw.write(countries.countries.get(i).getCountryName() + " <br>");
            }
            fw.append("</body></html>");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
