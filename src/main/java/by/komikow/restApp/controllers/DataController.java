package by.komikow.restApp.controllers;

import by.komikow.restApp.services.DataService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Komikov
 */
@Tag(name = "Data controller", description = "Passes a request from the user to the service controller and back")
@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    @Parameter(description = "Dependency injection from the service controller")
    private DataService dataServiceImpl;

    @Operation(
            summary = "interaction with the service controller",
            description = "Sending a request from the user to the service controller and receiving a response from the service controller"
    )
    @PostMapping()
    public String getCountChars(String request) {
        return dataServiceImpl.getCountChars(request);
    }
}
