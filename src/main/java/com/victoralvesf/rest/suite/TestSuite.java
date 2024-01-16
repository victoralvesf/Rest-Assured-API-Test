package com.victoralvesf.rest.suite;

import com.victoralvesf.rest.core.BaseTest;
import com.victoralvesf.rest.tests.AccountTest;
import com.victoralvesf.rest.tests.AuthTest;
import com.victoralvesf.rest.tests.BalanceTest;
import com.victoralvesf.rest.tests.TransactionTest;
import com.victoralvesf.rest.utils.Auth;
import com.victoralvesf.rest.utils.Database;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccountTest.class,
        TransactionTest.class,
        BalanceTest.class,
        AuthTest.class
})
public class TestSuite extends BaseTest {
    @BeforeClass
    public static void before() {
        String TOKEN = String.format("JWT %s", Auth.login());
        RestAssured.requestSpecification.header("Authorization", TOKEN);

        Database.reset();
    }
}
