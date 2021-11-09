package com.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    public void testPersonEndpoint() {
        given()
                .when().get("/hello/person")
                .then()
                .statusCode(200)
                .body(is("The person is mike of age 22 yrs and of height of 170 cm"));
    }

    /*@Test
    public void testPersonEndpoint() {
        given()
                .when().get("/hello/person")
                .then()
                .statusCode(200)
                .body(is("The person is jane of age 54 yrs and of height of 174 cm"));
    }*/
}