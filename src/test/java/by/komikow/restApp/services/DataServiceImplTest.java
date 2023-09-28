package by.komikow.restApp.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Sergey Komikov
 */
@ExtendWith(MockitoExtension.class)
class DataServiceImplTest {
    @Mock
    DataService dataServiceImpl;

    @Test
    void testGetStringFromNull() {
        String request = null;
        String result = dataServiceImpl.getCountChars(request);
        assertNull(result);
    }

    @Test
    void testGetStringFromString() {
        String request = "hello";
        String response = dataServiceImpl.getCountChars(request);
        assertNotSame(response, request);
    }
}