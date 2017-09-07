import java.util.ArrayList;

public class Countries {
    ArrayList<Country> countries;

    Countries(ArrayList<Country> countries) {
        this.countries = countries;
    }
    /**
     * <p>Возвращает по запрашиваемую страну по ее названию.</p>
     * @param name Вертикаль, на которой находится фигура (1=a, 8=h)
     *
     * @return Найденную страну, если такая есть, если нет - возвращает null
     */
    Country getCountry(String name){
        Country tmp = null;
        for (int i = 0; i < countries.size() ; i++) {
            if(countries.get(i).getCountryName().equals(name)){
                tmp = countries.get(i);
            }
        }
        return tmp;
    }

}

