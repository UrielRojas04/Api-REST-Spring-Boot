package com.utn.productos_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API de Productos - UTN",
                version = "1.0.0",
                description = "API REST desarrollada para gestionar productos con CRUD completo, validaciones, excepciones y documentación OpenAPI.",
                contact = @Contact(
                        name = "Uriel Rojas",
                        email = "uriel@example.com",
                        url = "https://www.utn.edu.ar"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                )
        )
)
public class OpenApiConfig {

}
