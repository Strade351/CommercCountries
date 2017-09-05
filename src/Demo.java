/**
 * Created by ABondarev on 04.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.reader();
        reader.sort();
        reader.parse();
        reader.write();
       reader.massc();
        HTMLGenerator htmlGenerator = new HTMLGenerator(reader.ccountries);
        htmlGenerator.generateHTMLList();
        for (int i = 0; i < reader.sstring.length; i++) {
            //  System.out.println(reader.sstring[i]);
            System.out.println(reader.countries.get(i).toString());

        }


    }

}
