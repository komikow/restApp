package by.komikow.restApp.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}