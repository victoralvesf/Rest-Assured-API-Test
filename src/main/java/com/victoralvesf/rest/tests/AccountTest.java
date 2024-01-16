package com.victoralvesf.rest.tests;

import com.victoralvesf.rest.core.BaseTest;
import com.victoralvesf.rest.models.Account;
import com.victoralvesf.rest.utils.GetAccountId;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class AccountTest extends BaseTest {
    @Test
    public void shouldCreateAnAccount() {
        Account account = new Account("Conta criada");

        given()
                .body(account)
            .when()
                .post("/contas")
            .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("nome", is("Conta criada"))
                .body("usuario_id", notNullValue())
                .body("visivel", is(true));
    }

    @Test
    public void shouldUpdateAnAccount() {
        Integer accountId = GetAccountId.byName("Conta para alterar");
        Account updatedAccount = new Account("Conta alterada");

        given()
                .body(updatedAccount)
                .pathParam("id", accountId)
            .when()
                .put("/contas/{id}")
            .then()
                .statusCode(200)
                .body("id", is(accountId))
                .body("nome", is("Conta alterada"))
                .body("usuario_id", notNullValue())
                .body("visivel", is(true));
    }

    @Test
    public void shouldNotCreateAnExistingAccount() {
        Account existingAccount = new Account("Conta mesmo nome");

        given()
                .body(existingAccount)
            .when()
                .post("/contas")
            .then()
                .statusCode(400)
                .body("error", is("Já existe uma conta com esse nome!"));
    }
}
