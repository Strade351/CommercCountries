import java.util.ArrayList;

/**
 * Created by ABondarev on 04.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Countries countries = new Countries(new ArrayList<>());
        Controller controller = new Controller(countries);
        controller.getCountriesList();
        controller.sortStrings();
        controller.generateTxt();
        controller.generateTable();
        controller.generateAlphabet();
        controller.reader();

        for (int i = 0; i < countries.countries.size() ; i++) {
            System.out.println(countries.countries.get(i).toString());

        }
    }

}
