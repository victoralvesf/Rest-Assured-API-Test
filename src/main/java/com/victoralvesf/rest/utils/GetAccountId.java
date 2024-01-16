package com.victoralvesf.rest.utils;

import static io.restassured.RestAssured.given;

public class GetAccountId {
    public static Integer byName(String name) {
        return given()
                .queryParam("nome", name)
                .when()
                .get("/contas")
                .then()
                .statusCode(200)
                .extract().path("id[0]");
    }
}
