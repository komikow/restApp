package by.komikow.restApp.utils;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Utils {
    @Schema(description = "converts the request string into a reverse-sorted Map, and then into a response string")
    public static String getCharsMap(String request) {
        String[] arrayChars = request.split("");
        Map<String, Integer> mapChars = new HashMap<>();
        for (int i = 0; i < arrayChars.length; i++) {
            if (mapChars.containsKey(arrayChars[i])) {
                int counter = mapChars.get(arrayChars[i]);
                mapChars.put(arrayChars[i], counter + 1);
            } else {
                mapChars.put(arrayChars[i], 1);
            }
        }
        return String.valueOf(sortByValue(mapChars));
    }

    @Schema(description = "sort Map in reverse order")
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue
            (Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
