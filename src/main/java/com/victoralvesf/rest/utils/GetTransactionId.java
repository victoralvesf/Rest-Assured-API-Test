package com.victoralvesf.rest.utils;

import static io.restassured.RestAssured.given;

public class GetTransactionId {
    public static Integer byDescription(String description) {
        return given()
                .queryParam("descricao", description)
                .when()
                .get("/transacoes")
                .then()
                .statusCode(200)
                .extract().path("id[0]");
    }
}
