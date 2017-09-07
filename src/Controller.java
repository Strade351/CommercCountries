import java.util.ArrayList;

/**
 * Created by ABondarev on 07.09.2017.
 */
public class Controller {
    Countries countries;
    Reader reader = new Reader();
    TxtGenerator txtGenerator;
    HTMLGenerator htmlGenerator;

    Controller(Countries countries) {
        txtGenerator = new TxtGenerator(countries);
        htmlGenerator = new HTMLGenerator(countries);
    }

    void generateTxt() {
        txtGenerator.generatetxt();
    }

    void generateTable() {
        htmlGenerator.generateHTMLList();
    }

    void generateAlphabet() {
        htmlGenerator.generateHTMLAlphList();
    }

    void generateCountriesList() {
        reader.fillContries(countries);

    }
}
