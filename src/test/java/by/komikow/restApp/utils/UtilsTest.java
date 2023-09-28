package by.komikow.restApp.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sergey Komikov
 */
@AutoConfigureMockMvc(printOnlyOnFailure = false)
class UtilsTest {
    Utils utils = new Utils();

    @Test
    void testGetStringFromString() {
        String request = "hello";
        String expectedString = "{l=2, e=1, h=1, o=1}";
        String result = Utils.getCharsMap(request);
        assertEquals(expectedString, result);
    }

    @Test
    void testGetStringFromNumber() {
        int numberRequest = 111122233;
        String expectedString = "{1=4, 2=3, 3=2}";
        String response = Utils.getCharsMap(String.valueOf(numberRequest));
        assertEquals(expectedString, response);
    }

    @Test
    void testGetSortingMap() {
        String request = "Application";
        String[] arrayChars = request.split("");
        Map<String, Integer> beforeSortingMap = new HashMap<>();
        IntStream.range(0, arrayChars.length).forEachOrdered(i -> {
            if (beforeSortingMap.containsKey(arrayChars[i])) {
                int counter = beforeSortingMap.get(arrayChars[i]);
                beforeSortingMap.put(arrayChars[i], counter + 1);
            } else {
                beforeSortingMap.put(arrayChars[i], 1);
            }
        });
        Map<String, Integer> afterSortingMap = Utils.sortByValue(beforeSortingMap);
        assertNotNull(beforeSortingMap);
        assertNotNull(afterSortingMap);
        assertNotSame(afterSortingMap, beforeSortingMap);
    }
}