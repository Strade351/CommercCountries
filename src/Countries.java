import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * Класс контейнер с массивом стран
 */
public class Countries {
    /**
     * conries - ArrayList для хранения списка стран
     */
    ArrayList<Country> countries;

    /**
     * Конструктор класса Countries
     * @param countries
     */
    Countries(ArrayList<Country> countries) {
        this.countries = countries;
    }
    /**
     * <p>Возвращает запрашиваемую страну по ее названию.</p>
     * @param name Название страны
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

    /**
     * <p>Добавляет страну в ArrayList</p>
     * @param countryName Название страны
     * @param peopleCount Население
     * @return Найденную страну, если такая есть, если нет - возвращает null
     */

    void addCountry(String countryName, int peopleCount) {
        Country country = new Country(countryName, peopleCount, Math.round((peopleCount)/Country.WORLD_POPULATION)/1000d);
        countries.add(country);
    }

    void sortCountries() {
        countries.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });
    }
}

