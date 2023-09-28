package by.komikow.restApp.services;

import by.komikow.restApp.utils.Utils;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static by.komikow.restApp.utils.Utils.getCharsMap;

/**
 * @author Sergey Komikov
 */
@Schema(description = "service controller")
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private Utils utils;

    @Schema(description = "transit of a processing request with a check for null and return of the prepared response to the controller")
    @Override
    public String getCountChars(String request) {
        return (request != null) ? getCharsMap(request) : "It's not string";
    }
}
