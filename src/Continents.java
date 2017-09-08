/**
 * Created by MUtemov on 08.09.2017.
 */
public enum Continents {
    AFRICA("Africa"),ASIA("Asia"),EUROPE("Europe"),NAMERICA("NAmerica"),SAMERICA("SAmerica"),OCEANIA("Oceania"),OTHER("Other");
    String name;
    Continents(String name){
    }

    @Override
    public String toString() {
        return name;
    }
}
