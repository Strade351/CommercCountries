import java.util.ArrayList;

public class Countries {
    ArrayList<Country> countries;

    public Countries(ArrayList<Country> countries) {
        this.countries = countries;
    }
    
    Country getCountry(String name){
        Country tmp = null;
        for (int i = 0; i < countries.size() ; i++) {
            if(countries.get(i).getCountryName().equals(name)){
                tmp = countries.get(i);
            }
            else return null;
            
            
        }
        return tmp;
        
    }

}

