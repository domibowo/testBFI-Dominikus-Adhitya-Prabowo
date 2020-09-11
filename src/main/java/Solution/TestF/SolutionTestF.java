package Solution.TestF;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.debatty.java.stringsimilarity.Levenshtein;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SolutionTestF {

    public List<String> searchSimilarCity(String search) throws IOException {
        List<String> cities = new ArrayList<String>();
        Levenshtein levenshtein = new Levenshtein();
        ObjectMapper objectMapper = new ObjectMapper();
        City[] cityMapper = objectMapper.readValue(new
                URL("https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json"), City[].class);
        for(City city: cityMapper){
            if (city.getCountry().equals("ID")&&levenshtein.distance(city.getName(),search)<=3.0){
                cities.add(city.getName());
            }
        }
        return cities;
    }
}
