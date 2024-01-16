package com.victoralvesf.rest.utils;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Auth {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String USER_EMAIL = dotenv.get("USER_EMAIL");
    private static final String USER_PASSWORD = dotenv.get("USER_PASSWORD");

    public static String login() {
        Map<String, String> user = new HashMap<>();
        user.put("email", USER_EMAIL);
        user.put("senha", USER_PASSWORD);

        return given()
                    .body(user)
                .when()
                    .post("/signin")
                .then()
                    .statusCode(200)
                    .extract().path("token");
    }
}
