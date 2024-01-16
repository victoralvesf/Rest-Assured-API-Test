package com.victoralvesf.rest.tests;

import com.victoralvesf.rest.core.BaseTest;
import com.victoralvesf.rest.models.Transaction;
import com.victoralvesf.rest.utils.GetAccountId;
import com.victoralvesf.rest.utils.GetTransactionId;
import com.victoralvesf.rest.utils.ValidTransaction;
import org.junit.Test;

import static com.victoralvesf.rest.utils.DateUtils.getDateWithDayDifference;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TransactionTest extends BaseTest {
    @Test
    public void shouldCreateATransaction() {
        Transaction transaction = ValidTransaction.generate();

        given()
                .body(transaction)
            .when()
                .post("/transacoes")
            .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("descricao", is(transaction.getDescricao()))
                .body("envolvido", is(transaction.getEnvolvido()))
                .body("valor", is("200.00"))
                .body("conta_id", is(transaction.getContaId()));
    }

    @Test
    public void shouldValidateTransactionRequiredFields() {
        given()
                .body("{}")
            .when()
                .post("/transacoes")
            .then()
                .statusCode(400)
                .body("$", hasSize(8))
                .body("msg", hasItems(
                        "Data da Movimentação é obrigatório",
                        "Data do pagamento é obrigatório",
                        "Descrição é obrigatório",
                        "Interessado é obrigatório",
                        "Valor é obrigatório",
                        "Valor deve ser um número",
                        "Conta é obrigatório",
                        "Situação é obrigatório"
                ));
    }

    @Test
    public void shouldNotCreateATransactionWithFutureDate() {
        Transaction transaction = ValidTransaction.generate();
        transaction.setDataTransacao(getDateWithDayDifference(1));

        given()
                .body(transaction)
            .when()
                .post("/transacoes")
            .then()
                .statusCode(400)
                .body("$", hasSize(1))
                .body("msg", hasItem("Data da Movimentação deve ser menor ou igual à data atual"));
    }

    @Test
    public void shouldNotRemoveAnAccountWithTransactions() {
        Integer accountId = GetAccountId.byName("Conta com movimentacao");

        given()
                .pathParam("id", accountId)
            .when()
                .delete("/contas/{id}")
            .then()
                .statusCode(500)
                .body("constraint", is("transacoes_conta_id_foreign"));
    }

    @Test
    public void shouldRemoveATransaction() {
        Integer transactionId = GetTransactionId.byDescription("Movimentacao para exclusao");

        given()
                .pathParam("id", transactionId)
            .when()
                .delete("/transacoes/{id}")
            .then()
                .statusCode(204);
    }
}
