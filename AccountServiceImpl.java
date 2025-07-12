package com.example.banking.service.impl;

import org.springframework.stereotype.Service;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;
import com.example.banking.mapper.AccountMapper;
import com.example.banking.repository.AccountRepository;
import com.example.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	private AccountRepository accountRepository;
	

	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		Account account= AccountMapper.mapToAccount(accountDto);
		Account saveAccount= accountRepository.save(account);
		return AccountMapper.mapToAccountDto(saveAccount);
	}

}
