package com.coderscampus.Assignment13.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment13.domain.Account;
import com.coderscampus.Assignment13.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepo;
	
	public Account save(Account account) {
		return accountRepo.save(account);
	}
	
	public Account findById(Long accountId) {
		Optional<Account> account = accountRepo.findById(accountId);
		return account.orElse(new Account());
	}
}
