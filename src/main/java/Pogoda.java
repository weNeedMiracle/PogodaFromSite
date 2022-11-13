import com.ibm.icu.text.Transliterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Pogoda {
    public static String Poluchit(String city){
        Transliterator t = Transliterator.getInstance("Russian-Latin/BGN");
        city = t.transliterate(city);
        try {
            Document doc = Jsoup.connect("https://world-weather.ru/pogoda/russia/"+city+"/").get();
            Elements elem = doc.select("#weather-now-number");
            String temp = elem.text();
            return temp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
