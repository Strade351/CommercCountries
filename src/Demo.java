/**
 * Created by ABondarev on 04.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.reader();
        reader.sort();
        reader.parse();
        reader.massc();
        TxtGenerator txtGenerator = new TxtGenerator(reader.ccountries);
        txtGenerator.generatetxt();
        HTMLGenerator htmlGenerator = new HTMLGenerator(reader.ccountries);
        htmlGenerator.generateHTMLList();
        htmlGenerator.generateHTMLAlphList();


    }

}
