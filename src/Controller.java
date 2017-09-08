import java.util.ArrayList;

/**
 * Created by ABondarev on 07.09.2017.
 */
public class Controller {
    private Countries countries;
    private Reader reader = new Reader();
    private TxtGenerator txtGenerator;
    private HTMLGenerator htmlGenerator;

    Controller(Countries countries) {
        this.countries = countries;
        txtGenerator = new TxtGenerator(countries);
        htmlGenerator = new HTMLGenerator(countries);
    }

    void generateTxt() {
        txtGenerator.generatetxt();
    }

    void generateTable() {
        htmlGenerator.generateHTMLList();
    }

    void sortStrings() {
        countries.sortCountries();
    }

    void generateAlphabet() {
        htmlGenerator.generateHTMLAlphList();
    }

    void generateCountriesList() {
        reader.fillContries(countries);
    }
}
