package com.victoralvesf.rest.utils;

import com.victoralvesf.rest.models.Transaction;

import static com.victoralvesf.rest.utils.DateUtils.getDateWithDayDifference;

public class ValidTransaction {
    public static Transaction generate() {
        Integer accountId = GetAccountId.byName("Conta para movimentacoes");

        Transaction transaction = new Transaction();
        transaction.setContaId(accountId);
        transaction.setDescricao("Descricao da movimentacao");
        transaction.setEnvolvido("Envolvido na movimentacao");
        transaction.setTipo("REC");
        transaction.setDataTransacao(getDateWithDayDifference(-1));
        transaction.setDataPagamento(getDateWithDayDifference(5));
        transaction.setValor(200f);
        transaction.setStatus(true);

        return transaction;
    }
}
