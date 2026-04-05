package com.example.springboot.unit;

import com.example.springboot.HelloController;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("unit")
public class HelloControllerUnitTest {

    @Test
    public void indexReturnsGreeting() {
        HelloController controller = new HelloController();
        String response = controller.index();
        assertThat(response).isEqualTo("Greetings from Spring Boot!");
    }
}