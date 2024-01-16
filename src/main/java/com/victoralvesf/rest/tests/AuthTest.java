package com.victoralvesf.rest.tests;

import com.victoralvesf.rest.core.BaseTest;
import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthTest extends BaseTest {
    @BeforeClass
    public static void before() {
        FilterableRequestSpecification reqSpec = (FilterableRequestSpecification) RestAssured.requestSpecification;
        reqSpec.removeHeader("Authorization");
        RestAssured.requestSpecification = reqSpec;
    }

    @Test
    public void shouldNotAccessAccountsWithoutToken() {
        given()
            .when()
                .get("/contas")
            .then()
                .statusCode(401);
    }

    @Test
    public void shouldNotAccessBalanceWithoutToken() {
        given()
            .when()
                .get("/saldo")
            .then()
                .statusCode(401);
    }

    @Test
    public void shouldNotAccessTransactionsWithoutToken() {
        given()
            .when()
                .get("/transacoes")
            .then()
                .statusCode(401);
    }
}
