package com.victoralvesf.rest.utils;

import static io.restassured.RestAssured.given;

public class Database {
    public static void reset() {
        given()
                .when()
                .get("/reset")
                .then()
                .statusCode(200);
    }
}
