package by.komikow.restApp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Test REST application",
                description = "Calculating the frequency of occurrence of symbols", version = "1.0.0",
                contact = @Contact(
                        name = "Komikov Sergey",
                        email = "komikovsergey@gmail.com"
                )
        )
)
public class OpenApiConfig {
}
