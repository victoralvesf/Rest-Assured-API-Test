package com.victoralvesf.rest.tests;

import com.victoralvesf.rest.core.BaseTest;
import com.victoralvesf.rest.utils.GetAccountId;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class BalanceTest extends BaseTest {
    @Test
    public void shouldGetTheAccountBalance() {
        Integer accountId = GetAccountId.byName("Conta para saldo");

        given()
            .when()
                .get("/saldo")
            .then()
                .statusCode(200)
                .body(String.format("find{it.conta_id == %s}.saldo", accountId), is("534.00"));
    }
}
