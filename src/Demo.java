/**
 * Created by ABondarev on 04.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.reader();
        for (int i = 0; i <reader.strings.size() ; i++) {
            System.out.println(reader.strings.get(i));
        }

    }

}
