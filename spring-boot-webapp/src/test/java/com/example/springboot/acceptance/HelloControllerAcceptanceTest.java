package com.example.springboot;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.client.RestTestClient;

@Tag( "acceptance")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureRestTestClient
public class HelloControllerAcceptanceTest {

    @Autowired
    private RestTestClient client;

    @Test
    public void getHelloReturnsGreeting() {
        client.get().uri("/")
                .exchangeSuccessfully()
                .expectBody(String.class)
                .isEqualTo("Greetings from Spring Boot!");
    }
}