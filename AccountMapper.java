package com.example.banking.mapper;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
            null, // Let DB generate the ID
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getBalance()
        );
    }
}
