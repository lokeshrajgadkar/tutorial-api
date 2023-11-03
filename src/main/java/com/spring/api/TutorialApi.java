package com.spring.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Lokesh Rajgadkar",
                        email = "lokeshrajgadkar13@gmail.com",
                        url = "https://www.linkedin.com/in/lokesh-rajgadkar-8b7496155/"
                ),
                title = "Tutorial Management App",
                description = "This is a Tutorial Management Spring Boot Application",
                version = "1.0.0",
                license = @License(
                        name = "License",
                        url = "https://www.linkedin.com/in/lokesh-rajgadkar-8b7496155/"
                ),
                termsOfService = "Terms Of Service"
        ),
        servers = {
                @Server(
                        description = "Dev Environment",
                        url = "https://tutorial-api.onrender.com"
                ),
                @Server(
                        description = "Local Environment",
                        url = "http://localhost:8081"
                )
        }
)
@RequestMapping(value ="/api")
@Tag(name = "Tutorial Management", description = "Tutorial management APIs")
@Validated
public interface TutorialApi {
}
